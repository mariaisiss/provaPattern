package provaPattern;
import java.util.HashMap;
import java.util.Map;


public class Catalogo {
	
	private static Catalogo catalogo;
	private Map<String, EmentaIF> cursos;
	
	
	public static Catalogo getCatalogo() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		if( Catalogo.catalogo == null)
			Catalogo.catalogo = new Catalogo();
		return Catalogo.catalogo; 
	}
	
	public void addCurso(Curso curso) {
		cursos.put(curso.getNome(), curso);
	}
	
	private Catalogo() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		this.cursos = new HashMap<String, EmentaIF>();
//		this.atuadores = new HashMap<TipoAtuador, AtuadorIF>();
//		this.load();
	}
	
	
}
