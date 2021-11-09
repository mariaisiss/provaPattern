package provaPattern;
import java.util.ArrayList;
import java.util.List;


public class Curso 
				extends Produto
				implements ProductIF {
	
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
	
	public String toString() {
		String ementa = new String();
		
		ementa = "Nome do Curso: " + this.getNome() + ".\n" + 
 				 "C�digo: " + this.getCodigoUnico() + ".\n" + 
				 "Carga hor�ria: " + "x " + ".\n";
		
		String temp = new String();
		for (ProductIF livro : this.livros) {
			temp = "Livro: " + livro.getNome()  + ".\n";
			ementa = ementa.concat(temp);
		}
			
		
		for (ProductIF disciplina : this.disciplinas) {
			temp = "Disciplina: " + disciplina.getNome()  + ".\n";
			ementa = ementa.concat(temp);
		}
			
		return ementa;
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
}

