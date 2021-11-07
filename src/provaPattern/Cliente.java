package provaPattern;

import java.lang.reflect.InvocationTargetException;

public class Cliente {
	
	public static TipoProdutos TIPOPRODUTOS;
	private ProductFactory factoryProdutos;
	

	
	public Cliente() throws 
						InstantiationException, 
						IllegalAccessException, 
						ClassNotFoundException, 
						IllegalArgumentException, 
						InvocationTargetException, 
						NoSuchMethodException, 
						SecurityException {
		
		TIPOPRODUTOS = TipoProdutos.LIVRO;
		this.factoryProdutos = (ProductFactory) (Class.forName(Cliente.TIPOPRODUTOS.getFactoryName()).getConstructor().newInstance());
		
	}
	
	public void rodar2() {
		ProductIF produto = null;
		produto = factoryProdutos.getProduto("CURSO ADS", "1ab4");
		System.out.println("Produto: " + produto.getDescription());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Código único: " + produto.getCodigoUnico());
	}
	
	public void rodar() {
		ProductIF produto = null;
		produto = factoryProdutos.getProduto("ADS", "1ab3");
		System.out.println("Produto: " + produto.getDescription());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Código único: " + produto.getCodigoUnico());
	}
	
	
	public static void main (String[] args) throws 
												InstantiationException, 
												IllegalAccessException, 
												ClassNotFoundException, 
												IllegalArgumentException, 
												InvocationTargetException, 
												NoSuchMethodException, 
												SecurityException {

		Cliente app = new Cliente();
		app.rodar();
		
		
	}
	

}
