package provaPattern;

import java.util.List;

public class DiretorDeBuilders {
	
	private BuilderIF builder;
	
	public DiretorDeBuilders(BuilderIF builder) {
		this.builder = builder;
	}
	
	/**
	* regular
	* @author Josemar Júnior e Maria Isis
	* @param 
	* @return 
	* @since 11/11/2021
	* @version 1.0
	* @exception 
	*/
	public Curso construirCurso  (
								String nome,
								String codUnico,
								String description,
								double preco,
								int cargaHorariaTotal,
								List<ProductIF> livros, 
								List<ProductIF> disciplinas) {
		
		Curso curso = (Curso) CursoBuilder
			.start()
			.setNome(nome)
			.setCodigoUnico(codUnico)
			.setDescription(description)
			.setCargaHorariaTotal(cargaHorariaTotal)
			.addTodosLivros(livros)
			.addTodasDisciplinas(disciplinas)
			.setPreco(preco)
			.build();
		return curso;
		
	}
	
	public Ementa construirEmenta(
			String nome,
			String codUnico,
			String description,
			double preco,
			int cargaHorariaTotal,
			List<ProductIF> livros, 
			List<ProductIF> disciplinas)  {

			Ementa ementa = (Ementa) CursoBuilder
				.start()
				.setNome(nome)
				.setCodigoUnico(codUnico)
				.setDescription(description)
				.setCargaHorariaTotal(cargaHorariaTotal)
				.setPreco(preco)
				.addTodosLivros(livros)
				.addTodasDisciplinas(disciplinas)
				.build();
			return ementa;

	}
	
//	public BuilderIF buildar(	
//			String nome,
//			String codUnico,
//			String description,
//			double preco,
//			int cargaHorariaTotal,
//			List<ProductIF> livros, 
//			List<ProductIF> disciplinas)  {
//		
//		BuilderIF retorno = (BuilderIF) this.builder
//			.start()
//			.setNome(nome)
//			.setCodigoUnico(codUnico)
//			.setDescription(description)
//			.setCargaHorariaTotal(cargaHorariaTotal)
//			.setPreco(preco)
//			.addTodosLivros(livros)
//			.addTodasDisciplinas(disciplinas)
//			.build();
//		return retorno;
//	}
}
