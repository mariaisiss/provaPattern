package provaPattern;

public abstract class  ProductFactory {
	
	public abstract ProductIF createProduto(String nome, String codUnico);
	
	public ProductIF getProduto(String nome, String codUnico) {
		
		ProductIF produto = this.createProduto(nome, codUnico);
		return produto;
		
	}
	
//	public static ProductFactory getFactory(String factoryName) {
//	if(factoryName.equalsIgnoreCase("LIVRO"))
//		return new LivroFactory();
//	else if(factoryName.equalsIgnoreCase("DISCIPLINA"))
//		return new DisciplinaFactory();
//	else if(factoryName.equalsIgnoreCase("CURSO"))
//		return new CursoFactory();
//	else
//		return null;
//}
	
//	public static ProductIF createProduct (int num) {
//		
//		if (num == 0) {
//			return (ProductIF) new Livro();
//		} else if (num == 1) {
//			return (ProductIF) new Disciplina ();
//		} else if (num == 2) {
//			return (ProductIF) new Curso ();	
//		}
//		
//		return null;
//	}
	
}
