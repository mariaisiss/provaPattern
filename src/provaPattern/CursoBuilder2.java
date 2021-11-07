package provaPattern;

import java.util.List;

//ABORDAGEEM INNER BUILD, uma classe internta faz o papel do builder, sem precisando de um 
public class CursoBuilder2
					extends Produto
					implements ProductIF{
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	private double preco;
	private String nome;
	
	public static class Builder {
		
		private List<ProductIF> livros;
		private List<ProductIF> disciplinas;
		private double preco;

		public Builder(List<ProductIF> livros, List<ProductIF> disciplinas) {
			this.livros = livros;
			this.disciplinas = disciplinas;
		}
		
		public static CursoBuilder2 reset() {
			return new CursoBuilder2(null);
		}

		public Builder addLivros(ProductIF livro) {
			this.livros.add(livro);
			return this;
		}
		
		public Builder addDisciplinas(ProductIF disciplina) {
			this.disciplinas.add(disciplina);
			return this;
		}
		
		public Builder setPreco(double preco) {
			this.preco = preco;
			return this;
				
		}

		public CursoBuilder2 build() {
			return new CursoBuilder2(this);
		}

	}

	CursoBuilder2(Builder builder) {
		this.setDescription();
		
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
	
	private void setDescription() {
		this.description = "CURSO BUILDER 2";
	}
	
	public List<ProductIF> getListaLivros(){
		return this.livros;
	}
	
	public List<ProductIF> getListaDisciplinas(){
		return this.disciplinas;
	}
	
}
