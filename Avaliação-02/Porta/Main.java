public class Main {

	public static void main(String[] args) {

		System.out.println("==============================");
		System.out.println("     ACOSTA'S PORTAS S/A      ");
		System.out.println("==============================");

		Porta p1 = new Porta(82, 210, "Angelim");

		// A LARGURA DA PORTA É 82? // true
		System.out.println(p1.largura == 82);
		// A ALTURA DA PORTA É 210? // true
		System.out.println(p1.altura == 210);
		// O MATERIAL DA PORTA É ANGELIM? // true
		System.out.println(p1.material.equals("Angelim"));

		// as seguintes linhas não compilam, comente-as
		//p1.largura = 233;
		//p1.altura = 3434;
		//p1.material = "Alumínio";
		// as portas começam fechadas e destrancadas
		System.out.println(p1.aberta()); // false
		System.out.println(p1.aberta() == false);
		System.out.println(p1.fechada() == true);
		System.out.println(p1.trancada()); // false
		System.out.println(p1.trancada() == false);
		// abrir
		p1.abrir();
		System.out.println(p1.aberta() == true);
		// fechar
		p1.fechar();
		System.out.println(p1.aberta() == false);
		// trancar
		p1.trancar();
		System.out.println(p1.trancada() == true);
		// não é possível abrir se trancada
		p1.abrir();
		System.out.println(p1.aberta() == false);
		// destrancar
		p1.destrancar();
		System.out.println(p1.trancada() == false);
		// pode abrir
		p1.abrir();
		System.out.println(p1.aberta() == true);
		// não pode trancar se aberta
		p1.trancar();
		System.out.println(p1.trancada() == false);
		// fechar e trancar
		p1.fechar(); p1.trancar();
		System.out.println(p1.aberta() == false);
		System.out.println(p1.trancada() == true);
	}

}
