package provaPattern;

public class Disciplina 
					extends Produto
					implements ProductIF {
	
	public double preco;
	public int chTotal;
	public double pctCumprido;
	public String professor;
	
	
	

	public Disciplina(double preco, int chTotal, double pctCumprido, String professor) {
		super("DISCIPLINA");
		this.preco = preco;
		this.chTotal = chTotal;
		this.pctCumprido = pctCumprido;
		this.professor = professor;
	}

	public Disciplina(String nome, String codUnico) {
		super("DISCIPLINA");
		this.setNome(nome);
		this.setCodigoUnico(codUnico);
		this.preco = 0.00;
		this.chTotal = 0;
		this.pctCumprido = 0;
		this.professor = "PROFESSOR DEFAULT";
	}

	public int getChTotal() {
		return chTotal;
	}

	public void setChTotal(int chTotal) {
		this.chTotal = chTotal;
	}

	public double getPctCumprido() {
		return pctCumprido;
	}

	public void setPctCumprido(double pctCumprido) {
		this.pctCumprido = pctCumprido;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
	
	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}