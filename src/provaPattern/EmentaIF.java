package provaPattern;

public interface EmentaIF {
	
	public EmentaIF setNome(String string);
	public EmentaIF setCodigoUnico(String codigoUnico);
	public EmentaIF setDescription(String description);
	public EmentaIF addLivros(ProductIF livro);
	public EmentaIF addDisciplinas(ProductIF disciplina);
	public Curso build();
	public String gerarEmenta();
	
}
