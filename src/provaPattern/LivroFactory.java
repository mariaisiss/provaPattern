package provaPattern;

public class LivroFactory extends ProductFactory {

	public LivroFactory() {
		super();
	}
	
	public ProductIF createProduto(String nome, String codUnico) {
		return new Livro(nome, codUnico);
	}
	
}
