package provaPattern;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

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
	
	public void rodar4() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		TIPOPRODUTOS = TipoProdutos.LIVRO;
		this.factoryProdutos = (ProductFactory) (Class.forName(Cliente.TIPOPRODUTOS.getFactoryName()).getConstructor().newInstance());
		ProductIF livro1 =  factoryProdutos.getProduto("React Native", "1ab4");
		ProductIF livro2 =  factoryProdutos.getProduto("Vue Js", "2bab4");
		List<ProductIF> livros = new ArrayList<ProductIF>();
		livros.add(livro1);
		livros.add(livro2);
		
		TIPOPRODUTOS = TipoProdutos.DISCIPLINA;
		this.factoryProdutos = (ProductFactory) (Class.forName(Cliente.TIPOPRODUTOS.getFactoryName()).getConstructor().newInstance());
		ProductIF disciplina =  factoryProdutos.getProduto("Desenvolvimento FrontEnd", "dis123as");
		List<ProductIF> disciplinas = new ArrayList<ProductIF>();
		disciplinas.add(disciplina);
		
		
		CursoBuilder builder = new CursoBuilder();
		DiretorDeBuilders diretor = new DiretorDeBuilders(builder);
		
		Curso curso = diretor.construirCurso(
								"ADS", 
								"4s2x1c233v", 
								"Curso de Análise e Desenvolv. de Sistemas",
								250.99, 
								66, 
								livros, 
								disciplinas);
								
		
		Catalogo catalogo = Catalogo.getCatalogo();
		catalogo.addCurso(curso);
		String cursoProcurar = "aDs";
		
		Curso cursoAchado = catalogo.getCurso(cursoProcurar);
		cursoAchado.setCargaHorariaCursada(20);
		System.out.println(cursoAchado.gerarEmenta() + "Carga Horária Cursada: " + cursoAchado.getCargaHorariaCursada());
		
		//Curso prototipado com a carga horária cursada zerada pro novo aluno
		Curso novoCurso = (Curso) curso.prototipar();
		System.out.println("\nCurso Prototipado\n"+ novoCurso.gerarEmenta() + "Carga Horária Cursada: " + novoCurso.getCargaHorariaCursada());
		
		//Printa ementa na tela
		Ementa ementa = diretor.construirEmenta(novoCurso);
		System.out.println("\nEmenta do Curso\n" + ementa.toString());
		
	}
	
	public void rodar3() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
//		TIPOPRODUTOS = TipoProdutos.LIVRO;
//		this.factoryProdutos = (ProductFactory) (Class.forName(Cliente.TIPOPRODUTOS.getFactoryName()).getConstructor().newInstance());
//		ProductIF livro1 =  factoryProdutos.getProduto("React Native", "1ab4");
//		ProductIF livro2 =  factoryProdutos.getProduto("Vue Js", "2bab4");
//		
//		TIPOPRODUTOS = TipoProdutos.DISCIPLINA;
//		this.factoryProdutos = (ProductFactory) (Class.forName(Cliente.TIPOPRODUTOS.getFactoryName()).getConstructor().newInstance());
//		ProductIF disciplina =  factoryProdutos.getProduto("Desenvolvimento FrontEnd", "dis123as");
//		
//		Curso curso = CursoBuilder
//						.start()
//						.setNome("ADS")
//						.setCodigoUnico("123AB")
//						.setDescription("Curso de Análise e Dev. de Sistemas")
//						.addLivro(livro1)
//						.addLivro(livro2)
//						.addDisciplina(disciplina)
//						.build();
//		
//		System.out.println(curso.gerarEmenta());
//		
//		Catalogo catalogo = Catalogo.getCatalogo();
//		catalogo.addCurso(curso);
//		String cursoProcurar = "ADS";
//		
//		Curso cursoAchado = catalogo.getCurso(cursoProcurar);
//		System.out.println(cursoAchado.gerarEmenta());
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
		app.rodar4();
		
		
	}
	

}
