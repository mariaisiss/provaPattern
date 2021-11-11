package provaPattern;

import java.util.List;

public class AbstractBuilder implements BuilderIF {
	private String nome;
	private String codigoUnico;
	public String description;
	private double preco;
	private int cargaHorariaTotal;
	private int cargaHorariaCursada;
	
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	
	public AbstractBuilder() {
		super();
	}

	@Override
	public BuilderIF setNome(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuilderIF setCodigoUnico(String codigoUnico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuilderIF setDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuilderIF addLivro(ProductIF livro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuilderIF addDisciplina(ProductIF disciplina) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuilderIF addTodosLivros(List<ProductIF> livros) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuilderIF addTodasDisciplinas(List<ProductIF> disciplinas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuilderIF setCargaHorariaTotal(int cargaHorariaTotal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuilderIF setPreco(double preco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductIF build() {
		// TODO Auto-generated method stub
		return null;
	}
}
