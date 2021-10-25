package provaPattern;

public class DisciplinaFactory extends ProductFactory {

	public DisciplinaFactory() {
		super();
	}
	
	public ProductIF createProduto(String nome, String codUnico) {
		return new Disciplina(nome, codUnico);
	}
	
}
