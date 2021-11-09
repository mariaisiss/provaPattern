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
		
		Curso curso = null;
		if (this.cursos.containsKey(nomeCurso)) {
			for (String key : cursos.keySet()) {
	            curso = cursos.get(key);
			}
		}
		
		return curso;
	}
	
}
