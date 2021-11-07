package provaPattern;
import java.util.ArrayList;
import java.util.List;


//TO DO: Implementar builder
public class Curso 
				extends Produto
				implements CursoIF {
	
	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	private double preco;
	
	public Curso(List<ProductIF> livros, List<ProductIF> disciplinas) {
		this.livros = livros;
		this.disciplinas = disciplinas;
	}
	

}
