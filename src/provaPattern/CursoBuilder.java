package provaPattern;

import java.util.ArrayList;
import java.util.List;

//ABORDAGEM OUTTER BUILDER, uma classe externa ainda será usada para o processo do builder (Como Fred fez)
public class CursoBuilder 
					implements ProductIF, CursoIF {
	
	private String nome;
	private String codigoUnico;
	public String description;
	private double preco;
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;

	
	public static EmentaIF start() {
		return (EmentaIF) new CursoBuilder();
	}
	
	private CursoBuilder() {
		this.livros = new ArrayList<ProductIF>();
		this.disciplinas = new ArrayList<ProductIF>();
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getCodigoUnico() {
		return this.codigoUnico;
	}

	@Override
	public String getDescription() {
	return this.description;
	}
	
	@Override
	public double getPreco() {
	return this.preco;
	}
	
	
	//Métodos builder
	public CursoBuilder setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public CursoBuilder setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
		return this;
	}
	
	public CursoBuilder setPreco(double preco) {
		this.preco = preco;
		return this;
	}
	
	public CursoBuilder setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public CursoBuilder addLivro(ProductIF livro) {
		this.livros.add(livro);
		return this;
	}
	
	public CursoBuilder addDisciplina(ProductIF disciplina) {
		this.disciplinas.add(disciplina);
		return this;
	}
	
	@Override
	public CursoBuilder addTodosLivros(List<ProductIF> livros) {
		this.livros = livros;
		return this;
	}

	@Override
	public CursoBuilder addTodasDisciplina(List<ProductIF> disciplinas) {
		this.disciplinas = disciplinas;
		return this;
	}
	
	public Curso build() {
		return new Curso(this.livros, this.disciplinas, this.nome, this.codigoUnico, this.description, this.preco);
	}
	//Fim dos métodos builder
	
	
	@Override
	public String gerarEmenta() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
