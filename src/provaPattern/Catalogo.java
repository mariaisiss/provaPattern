package provaPattern;
import java.util.HashMap;
import java.util.Map;


public class Catalogo {
	
	private static Catalogo catalogo;
	private Map<String, Curso> cursos;
	
	
	public static Catalogo getCatalogo() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		if( Catalogo.catalogo == null)
			Catalogo.catalogo = new Catalogo();
		return Catalogo.catalogo; 
	}
	
	private Catalogo() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		this.cursos = new HashMap<String, Curso>();
	}
	
	public void addCurso(Curso curso) {
		cursos.put(curso.getNome(), curso);
	}
	
	public Curso getCurso(String nomeCurso) {
		
		String upCase = nomeCurso.toUpperCase();
		Curso curso = null;
		if (this.cursos.containsKey(upCase)) {
			for (String key : cursos.keySet()) {
	            curso = cursos.get(key);
			} 
		} else {
			System.out.println("Curso não encontrado");
			curso = null;
		}
		
		return curso;
	}
	
}
