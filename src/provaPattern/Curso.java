package provaPattern;
import java.util.ArrayList;
import java.util.List;


public class Curso 
				extends Produto
				implements ProductIF, Prototipavel {
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	private double preco;
	private int cargaHorariaTotal;
	private int cargaHorariaCursada;
	private Ementa ementa;
	

	
	public Curso(List<ProductIF> livros, List<ProductIF> disciplinas) {
		this.livros = new ArrayList<ProductIF>();
		this.disciplinas = new ArrayList<ProductIF>();
		this.livros = livros;
		this.disciplinas = disciplinas;
	}
	
	public Curso(List<ProductIF> livros, List<ProductIF> disciplinas, String nome, String codigoUnico, String description, double preco, int cargaHorariaTotal) {
		this.livros = livros;
		this.disciplinas = disciplinas;
		this.setNome(nome);
		this.setCodigoUnico(codigoUnico);
		this.setDescription(description);
		this.setPreco(preco);
		this.setCargaHorariaTotal(cargaHorariaTotal);
		this.zerarCargaHorariaCursada();
	}
	
	private Curso(Curso cursoPrototipar) {
		
		this.livros = cursoPrototipar.getLivros();
		this.disciplinas = cursoPrototipar.getDisciplinas();
		this.setNome(cursoPrototipar.getNome());
		this.setCodigoUnico(cursoPrototipar.getCodigoUnico());
		this.setDescription(cursoPrototipar.getDescription());
		this.setPreco(cursoPrototipar.getPreco());
		this.setCargaHorariaTotal(cursoPrototipar.getCargaHorariaTotal());
		this.zerarCargaHorariaCursada();
	}	
	
	public List<ProductIF> getLivros() {
		return this.livros;
	}

	public List<ProductIF> getDisciplinas() {
		return this.disciplinas;
	}
	
	public int getCargaHorariaTotal() {
		return cargaHorariaTotal;
	}


	public int getCargaHorariaCursada() {
		return cargaHorariaCursada;
	}
	
	public void setCargaHorariaTotal(int cargaHorariaTotal) {
		this.cargaHorariaTotal = cargaHorariaTotal;
	}

	public void setCargaHorariaCursada(int cargaHorariaCursada) {
		this.cargaHorariaCursada = cargaHorariaCursada;
	}

	public String gerarEmenta() {
		this.ementa = (Ementa) EmentaBuilder
								.start()
								.setNome(this.getNome())
								.setCodigoUnico(this.getCodigoUnico())
								.setDescription(this.getDescription())
								.addTodosLivros(this.livros)
								.addTodasDisciplinas(this.disciplinas)
								.setCargaHorariaTotal(this.cargaHorariaTotal)
								.build();
		return ementa.toString();
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public Prototipavel prototipar() {
		return new Curso(this);
	}

	private void zerarCargaHorariaCursada() {
		this.cargaHorariaCursada = 0;
	}
	
	
}

