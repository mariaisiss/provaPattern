package provaPattern;

import java.util.List;

public interface BuilderIF {
	
	public BuilderIF setNome(String string);
	public BuilderIF setCodigoUnico(String codigoUnico);
	public BuilderIF setDescription(String description);
	public BuilderIF addLivro(ProductIF livro);
	public BuilderIF addDisciplina(ProductIF disciplina);
	public BuilderIF addTodosLivros(List<ProductIF> livros);
	public BuilderIF addTodasDisciplinas(List<ProductIF> disciplinas);
	public BuilderIF setCargaHorariaTotal(int cargaHorariaTotal);
	public BuilderIF setPreco(double preco);
	public ProductIF build();
	public String toString();
	public static BuilderIF start(){
		return (BuilderIF) new AbstractBuilder();
	};
}
