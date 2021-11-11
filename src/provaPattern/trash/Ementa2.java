package provaPattern.trash;

import java.util.ArrayList;
import java.util.List;

import provaPattern.ProductIF;

public class Ementa2 {
	
	private String nome;
	private String codigoUnico;
	public String description;
	


	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	
	public Ementa2(List<ProductIF> livros, List<ProductIF> disciplinas, String nome, String codigoUnico, String description) {
		this.livros = new ArrayList<ProductIF>();
		this.disciplinas = new ArrayList<ProductIF>();
		
		this.livros = livros;
		this.disciplinas = disciplinas;
		this.setNome(nome);
		this.setCodigoUnico(codigoUnico);
		this.setDescription(description);
	}
	
	private void setDescription(String description2) {
		this.description = description2;
	}

	private void setCodigoUnico(String codigoUnico2) {
		this.codigoUnico = codigoUnico2;
	}

	private void setNome(String nome2) {
		this.nome = nome2;
	}


	private String getNome() {
		return nome;
	}


	private String getCodigoUnico() {
		return codigoUnico;
	}

	
	private String getDescription() {
		return description;
	}
	
	public String toString() {
		String ementa = new String();
		
		ementa = "Nome do Curso: " + this.getNome() + ".\n" + 
				 "Descrição: " + this.getDescription() + ".\n" +
 				 "Código: " + this.getCodigoUnico() + ".\n" + 
				 "Carga horária: " + "xx" + ".\n";
		
		String temp = new String();
		for (ProductIF livro : this.livros) {
			temp = "Livro: " + livro.getNome()  + ".\n";
			ementa = ementa.concat(temp);
		}
			
		
		for (ProductIF disciplina : this.disciplinas) {
			temp = "Disciplina: " + disciplina.getNome()  + ".\n";
			ementa = ementa.concat(temp);
		}
			
		return ementa;
	}

}
