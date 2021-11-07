package provaPattern;

public enum TipoProdutos {
	
	LIVRO("provaPattern.LivroFactory"), 
	DISCIPLINA("provaPattern.DisciplinaFactory"),
	CURSO("provaPattern.CursoFactory"),
	CURSO2("provaPattern.CursoBuilder2");
	
	String className;
	
	private TipoProdutos(String className) {
		this.className = className;
	}
	
	public String getFactoryName() {
		return this.className;
	}
	
}
