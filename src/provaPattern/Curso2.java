package provaPattern;
import java.util.ArrayList;
import java.util.List;


//TO DO: Implementar builder
public class Curso2 
				extends Produto
				implements ProductIF {
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	private double preco;
	
	public Curso2(String nome, String codUnico) {
		super("CURSO");
		this.setNome(nome);
		this.setCodigoUnico(codUnico);
		this.livros = new ArrayList<ProductIF>();
		this.disciplinas = new ArrayList<ProductIF>();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Curso2 addLivros(ProductIF livro) {
		this.livros.add(livro);
		return this;
	}

	public Curso2 addDisciplinas(ProductIF disciplina) {
		this.disciplinas.add(disciplina);
		return this;
	}

}
