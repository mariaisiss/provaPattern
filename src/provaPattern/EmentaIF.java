package provaPattern;

import java.util.List;

public interface EmentaIF {
	
	public EmentaIF setNome(String string);
	public EmentaIF setCodigoUnico(String codigoUnico);
	public EmentaIF setDescription(String description);
	public EmentaIF addLivro(ProductIF livro);
	public EmentaIF addDisciplina(ProductIF disciplina);
	public EmentaIF addTodosLivros(List<ProductIF> livros);
	public EmentaIF addTodasDisciplina(List<ProductIF> disciplinas);
	public Curso build();
	public String gerarEmenta();
}
