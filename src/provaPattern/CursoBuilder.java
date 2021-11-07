package provaPattern;

import java.util.ArrayList;
import java.util.List;

public class CursoBuilder 
					extends Produto
					implements ProductIF {
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	private double preco;
	
	public CursoBuilder(String nome, String codUnico) {
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
	
	
	public Curso addLivros(ProductIF livro) {
		this.livros.add(livro);
		return this;
	}
	
	public Curso addDisciplinas(ProductIF disciplina) {
		this.disciplinas.add(disciplina);
		return this;
	}
	
	public Curso build() {
		for(ProductIF livro : this.livros)
			livros.setLogger(this.logger);
		
		for(ProductIF disciplina : this.disciplinas)
			disciplinas.setLogger(this.logger);	
		
		return new Curso(this.livros, this.disciplinas);
	}
}
