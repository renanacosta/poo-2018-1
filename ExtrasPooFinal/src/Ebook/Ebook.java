package Ebook;

public class Ebook {
	final String titulo;
	final int paginas;
	private int paginaAtual;

	public Ebook(String titulo, int paginas) {
		if (titulo == "")
			throw new IllegalArgumentException("ERRO - Título não pode ficar vazio!");
		this.titulo = titulo;
		if (paginas < 1 || paginas > 5000)
			throw new IllegalArgumentException("ERRO - N° de páginas inválido!");
		this.paginas = paginas;
		this.paginaAtual = 1;
	}

	public int paginaAtual() {
		return this.paginaAtual;
	}

	public void virarPagina() {
		if (paginaAtual == 5000)
			throw new IllegalStateException("Fim do livro. Não existem mais páginas!");
		paginaAtual++;
	}

	public void voltarPagina() {
		if (paginaAtual == 1)
			throw new IllegalStateException("Você está na página inicial. Não existem páginas anteriores!");
		paginaAtual--;
	}

}
