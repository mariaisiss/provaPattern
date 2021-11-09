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
		
//		TIPOPRODUTOS = TipoProdutos.LIVRO;
//		this.factoryProdutos = (ProductFactory) (Class.forName(Cliente.TIPOPRODUTOS.getFactoryName()).getConstructor().newInstance());
		
	}

	public void rodar3() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		TIPOPRODUTOS = TipoProdutos.LIVRO;
		this.factoryProdutos = (ProductFactory) (Class.forName(Cliente.TIPOPRODUTOS.getFactoryName()).getConstructor().newInstance());
		ProductIF livro1 =  factoryProdutos.getProduto("React Native", "1ab4");
		ProductIF livro2 =  factoryProdutos.getProduto("Vue Js", "2bab4");
		
		TIPOPRODUTOS = TipoProdutos.DISCIPLINA;
		this.factoryProdutos = (ProductFactory) (Class.forName(Cliente.TIPOPRODUTOS.getFactoryName()).getConstructor().newInstance());
		ProductIF disciplina =  factoryProdutos.getProduto("Desenvolvimento FrontEnd", "dis123as");
		
		Curso curso = CursoBuilder
						.start()
						.setNome("ADS")
						.setCodigoUnico("123AB")
						.setDescription("Curso de Análise e Dev. de Sistemas")
						.addLivro(livro1)
						.addLivro(livro2)
						.addDisciplina(disciplina)
						.build();
		
		System.out.println(curso.gerarEmenta());
		
		Catalogo catalogo = Catalogo.getCatalogo();
		catalogo.addCurso(curso);
		String cursoProcurar = "ADS";
		
		Curso cursoAchado = catalogo.getCurso(cursoProcurar);
		System.out.println(cursoAchado.gerarEmenta());
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
		app.rodar3();
		
		
	}
	

}
