package provaPattern;


public class Livro 
				extends Produto
				implements ProductIF{

	public double preco;
	public String isbn;
	public String editora;
	public String autor;
	public int ano;
	public int paginas;
	public int edicao;
	
	
	public Livro(String nome, String codUnico) {
		super("LIVRO");
		this.setNome(nome);
		this.setCodigoUnico(codUnico);		
		this.preco = 0.00;
		this.isbn = "ISBN DEFAULT";
		this.editora = "EDITORA DEFAULT";
		this.autor = "AUTOR DEFAULT";
		this.ano = 0;
		this.paginas = 0;
		this.edicao = 0;
	}

	public Livro(double preco, String isbn, String editora, String autor, int ano, int paginas, int edicao) {
		super("LIVRO");
		this.preco = preco;
		this.isbn = isbn;
		this.editora = editora;
		this.autor = autor;
		this.ano = ano;
		this.paginas = paginas;
		this.edicao = edicao;
	}

	public void setPreco(double preco){
	        this.preco = preco;
	}
	
	
	public String getIsbn() {
		return null;
	}
	
	public void setIsbn(String isbn){
	        this.isbn = isbn;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getPaginas() {
		return paginas;
	}


	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	public int getEdicao() {
		return edicao;
	}


	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}


	@Override
	public double getPreco() {
		return this.preco;
	}

		
}