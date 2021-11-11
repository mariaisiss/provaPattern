package provaPattern;

import java.util.ArrayList;
import java.util.List;

//ABORDAGEM OUTTER BUILDER, uma classe externa ainda será usada para o processo do builder (Como Fred fez)
public class CursoBuilder 
					extends AbstractBuilder
					implements ProductIF, BuilderIF {
	
	private String nome;
	private String codigoUnico;
	public String description;
	private double preco;
	private int cargaHorariaTotal;
	private int cargaHorariaCursada;
	
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;

	
	public static BuilderIF start() {
		return (BuilderIF) new CursoBuilder();
	}
	
	public CursoBuilder() {
		super();
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
	
	public int getCargaHorariaCursada() {
		return cargaHorariaCursada;
	}
	
	public int getCargaHorariaTotal() {
		return cargaHorariaTotal;
	}

	public void setCargaHorariaCursada(int cargaHorariaCursada) {
		this.cargaHorariaCursada = cargaHorariaCursada;
	}
	
	//Métodos Builder BEGIN
	
	public BuilderIF setNome(String nome) {
		String upCase = nome.toUpperCase();
		this.nome = upCase;
		return this;
	}
	
	public BuilderIF setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
		return this;
	}
	
	public BuilderIF setCargaHorariaTotal(int cargaHorariaTotal) {
		this.cargaHorariaTotal = cargaHorariaTotal;
		return this;
	}

	
	public BuilderIF setPreco(double preco) {
		this.preco = preco;
		return this;
	}
	
	public BuilderIF setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public BuilderIF addLivro(ProductIF livro) {
		this.livros.add(livro);
		return this;
	}
	
	public BuilderIF addDisciplina(ProductIF disciplina) {
		this.disciplinas.add(disciplina);
		return this;
	}
	
	@Override
	public BuilderIF addTodosLivros(List<ProductIF> livros) {
		this.livros = livros;
		return this;
	}

	@Override
	public BuilderIF addTodasDisciplinas(List<ProductIF> disciplinas) {
		this.disciplinas = disciplinas;
		return this;
	}
	
	public ProductIF build() {
		return new Curso(this.livros, this.disciplinas, this.nome, this.codigoUnico, this.description, this.preco, this.cargaHorariaTotal);
	}
	//Métodos Builder END 

}
