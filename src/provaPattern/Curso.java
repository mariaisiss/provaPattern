package provaPattern;
import java.util.ArrayList;
import java.util.List;


public class Curso 
				extends Produto
				implements ProductIF, Prototipavel {
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	private double preco;
	private Ementa ementa;
	
	public Curso(List<ProductIF> livros, List<ProductIF> disciplinas) {
		this.livros = new ArrayList<ProductIF>();
		this.disciplinas = new ArrayList<ProductIF>();
		this.livros = livros;
		this.disciplinas = disciplinas;
	}
	
	public Curso(List<ProductIF> livros, List<ProductIF> disciplinas, String nome, String codigoUnico, String description, double preco) {
		this.livros = livros;
		this.disciplinas = disciplinas;
		this.setNome(nome);
		this.setCodigoUnico(codigoUnico);
		this.setDescription(description);
		this.setPreco(preco);		
	}
	
	private Curso(Curso cursoPrototipar) {
		
		this.livros = cursoPrototipar.getLivros();
		this.disciplinas = cursoPrototipar.getDisciplinas();
		this.setNome(cursoPrototipar.getNome());
		this.setCodigoUnico(cursoPrototipar.getCodigoUnico());
		this.setDescription(cursoPrototipar.getDescription());
		this.setPreco(cursoPrototipar.getPreco());
		
	}	
	
	
	public List<ProductIF> getLivros() {
		return this.livros;
	}

	public List<ProductIF> getDisciplinas() {
		return this.disciplinas;
	}

	public String gerarEmenta() {
		this.ementa = EmentaBuilder
								.start()
								.setNome(this.getNome())
								.setCodigoUnico(this.getCodigoUnico())
								.setDescription(this.getDescription())
								.addLivros(this.livros)
								.addDisciplinas(this.disciplinas)
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
	
	
}

