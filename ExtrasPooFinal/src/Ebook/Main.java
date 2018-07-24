package Ebook;

public class Main {
	public static void main(String[] args) {

		System.out.println("=========");
		System.out.println("| EBOOK |");
		System.out.println("=========");
		System.out.println();

	
		System.out.println();
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println(" Titulo = \"Os inovadores\", paginas = 544 ");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println();
		
		// titulo = "Os inovadores", paginas = 544
		Ebook e1 = new Ebook("Os inovadores", 544);

		System.out.println(e1.titulo); // Os inovadores
		System.out.println(e1.titulo.equals("Os inovadores")); // true

		// essa linha não deve compilar (comente-a)
		// e1.titulo = "Alterando o título";
		System.out.println(e1.paginas); // 544
		System.out.println(e1.paginas == 544); // true

		// essa linha não deve compilar (comente-a)
		// e1.paginas = 120

		// página atual sendo lida sempre inicia com 1
		System.out.println(e1.paginaAtual() == 1);

		// essa linha não deve compilar (comente-a)
		// System.out.println(e1.paginaAtual); // sem acesso direto a página atual

		
		System.out.println();
		System.out.println("<><><><><><><><><><><><><><><><>");
		System.out.println(" Sequência de e-books inválidos ");
		System.out.println("<><><><><><><><><><><><><><><><>");
		System.out.println();
		
		// sequência de e-books inválidos
		// as instruções devem lançar uma IllegalArgumentException

		try {
			Ebook ebookInvalido = new Ebook("", 544); // titulo vazio
			System.out.println(false); // essa linha não deve ser alcançada
		} catch (IllegalArgumentException e) { // a exceção deve ser capturada
			System.out.println(true);
			
		}

		try {
			Ebook ebookInvalido = new Ebook("Um titulo", 0); // sem páginas
			System.out.println(false);
		} catch (IllegalArgumentException e) {
			System.out.println(true);
			
		}

		try {
			Ebook ebookInvalido = new Ebook("Um titulo", -10); // páginas negativas
			System.out.println(false);
		} catch (IllegalArgumentException e) {
			System.out.println(true);
			
		}

		try {
			Ebook ebookInvalido = new Ebook("Um titulo", 6000); // páginas > 5000
			System.out.println(false);
		} catch (IllegalArgumentException e) {
			System.out.println(true);
			System.out.println("================================");
		}

		Ebook e2 = new Ebook("A catedral e o bazar", 14);
		// http://www.dominiopublico.gov.br/pesquisa/DetalheObraForm.do?select_action=&co_obra=8679
		System.out.println(e2.titulo.equals("A catedral e o bazar"));
		System.out.println(e2.paginas == 14);
		System.out.println(e2.paginaAtual() == 1);

		Ebook e3 = new Ebook("O (comovente) guia de Ruby do why", 121);
		// http://why.carlosbrando.com/
		// https://en.wikipedia.org/wiki/Why_the_lucky_stiff
		System.out.println(e3.titulo.equals("O (comovente) guia de Ruby do why"));
		System.out.println(e3.paginas == 121);
		System.out.println(e3.paginaAtual() == 1);

		e2.virarPagina(); // paginaAtual + 1

		System.out.println(e2.paginaAtual() == 2);

		for (int i = 0; i < 10; i++)
			e2.virarPagina(); // 10 pag viradas

		System.out.println(e2.paginaAtual() == 12);

		e2.voltarPagina();

		System.out.println(e2.paginaAtual() == 11);

		for (int i = 0; i < 10; i++)
			e2.voltarPagina(); // 10 pag atrás

		System.out.println(e2.paginaAtual() == 1);

		
		System.out.println();
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println(" Tentar voltar página antes do 1 deve ser proibido ");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println();
		
		// tentar voltar página antes do 1 deve ser proibido
		// lançando IllegalStateException, descomente, verifique, comente outra vez

		try {
			e2.voltarPagina(); // deve lançar IllegalStateException
			System.out.println(false);
		} catch (IllegalStateException e) {
			System.out.println(true);
		}

		System.out.println(e2.paginaAtual() == 1);
		System.out.println();
		System.out.println("## FIM DO PROGRAMA ##");
	}
}