package provaPattern;
import java.util.ArrayList;
import java.util.List;

public class Ementa implements ProductIF{
	
	private String nome;
	private String codigoUnico;
	public String description;
	private double preco;
	private int cargaHorariaTotal;


	private int getCargaHorariaTotal() {
		return cargaHorariaTotal;
	}

	private void setCargaHorariaTotal(int cargaHorariaTotal) {
		this.cargaHorariaTotal = cargaHorariaTotal;
	}

	private List<ProductIF> livros;
	private List<ProductIF> disciplinas;
	
	public Ementa(List<ProductIF> livros, List<ProductIF> disciplinas, String nome, String codigoUnico, String description, double preco, int cargaHorariaTotal) {
		this.livros = new ArrayList<ProductIF>();
		this.disciplinas = new ArrayList<ProductIF>();
		
		this.livros = livros;
		this.disciplinas = disciplinas;
		this.setNome(nome);
		this.setCodigoUnico(codigoUnico);
		this.setDescription(description);
		this.setPreco(preco);
		this.setCargaHorariaTotal(cargaHorariaTotal);
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public String getCodigoUnico() {
		return this.codigoUnico;
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
	
	public String toString() {
		String ementa = new String();
		
		ementa = "Nome do Curso: " + this.getNome() + ".\n" + 
				 "Descrição: " + this.getDescription() + ".\n" +
 				 "Código: " + this.getCodigoUnico() + ".\n" + 
				 "Carga horária: " + this.getCargaHorariaTotal() + ".\n";
		
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
