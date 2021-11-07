package provaPattern;
import java.util.ArrayList;
import java.util.List;


//EXCLUIR, POIS O BUILDER É O CURSO
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
	
	public String gerarEmenta(String nomeDoCurso, String codCurso, int cargaHoraria, List<ProductIF> livros, List<ProductIF> disciplinas) {
		String ementa = new String();
		
		ementa = "Nome do Curso: " + nomeDoCurso + "./n" + 
 				 "Código: " + codCurso + "./n" + 
				 "Carga horária: " + cargaHoraria + "./n";
		
		String temp = new String();
		for (ProductIF livro : this.livros)
			temp = "Livro: " + livro.getNome()  + "./n";
			ementa.concat(temp);
		
		for (ProductIF disciplina : this.disciplinas)
			temp = "Livro: " + disciplina.getNome()  + "./n";
			ementa.concat(temp);
			
		return ementa;
	}
}

