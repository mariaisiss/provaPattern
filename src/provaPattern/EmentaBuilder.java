package provaPattern;

import java.util.ArrayList;
import java.util.List;

//ABORDAGEM OUTTER BUILDER, uma classe externa ainda será usada para o processo do builder (Como Fred fez)
public class EmentaBuilder {
	
	private String nome;
	private String codigoUnico;
	public String description;
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;

	
	public static EmentaBuilder start() {
		return new EmentaBuilder();
	}
	
	private EmentaBuilder() {
		this.livros = new ArrayList<ProductIF>();
		this.disciplinas = new ArrayList<ProductIF>();
	}
	
	//Métodos builder
	public EmentaBuilder setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public EmentaBuilder setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
		return this;
	}
	
	
	public EmentaBuilder setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public EmentaBuilder addLivros(List<ProductIF> livros) {
		this.livros = livros;
		return this;
	}
	
	public EmentaBuilder addDisciplinas( List<ProductIF> disciplinas) {
		this.disciplinas = disciplinas;
		return this;
	}

	
	public Ementa build() {
		return new Ementa(this.livros, this.disciplinas, this.nome, this.codigoUnico, this.description);
	}
	
}
