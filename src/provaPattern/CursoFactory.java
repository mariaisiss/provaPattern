package provaPattern;

public class CursoFactory extends ProductFactory {
	
	public CursoFactory() {
		super();
	}
	
	public ProductIF createProduto(String nome, String codUnico) {
		return new Curso(nome, codUnico);
	}
}
