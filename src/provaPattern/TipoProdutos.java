package provaPattern;
// Enumerador, conforme pedido na QUESTÃO 1

public enum TipoProdutos {
	
	LIVRO("provaPattern.LivroFactory"), 
	DISCIPLINA("provaPattern.DisciplinaFactory");
	
	String className;
	
	private TipoProdutos(String className) {
		this.className = className;
	}
	
	public String getFactoryName() {
		return this.className;
	}
	
}
