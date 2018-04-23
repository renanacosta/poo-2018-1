class Main {
  public static void main(String[] args) {
	  	System.out.println("===========CASA============================");
	    Casa loc1 = new Casa("Rua Alfredo Huch, 475", 2, 1, 900.0, 0.0);
	    // constantes/imutáveis
	    System.out.println(loc1.endereco); // Rua Alfredo Huch, 475
	    System.out.println(loc1.quartos); // 2
	    System.out.println(loc1.garagem); // 1 (carro)
	    // variáveis
	    System.out.println(loc1.prazo()); // 12 (meses)
	    System.out.println(loc1.valor()); // 900.0
	    System.out.println(loc1.valorTotal()); // 900.0 // não considera condomínio
	    System.out.println("===========FIM CASA=========================");
	    
	    System.out.println("===========APARTAMENTO======================");
	    Apartamento loc2 = new Apartamento("Av 24 de maio, 355", 1, 1, 400.0, 400.0);
	    // constantes/imutáveis
	    System.out.println(loc2.endereco); // Av 24 de maio, 355
	    System.out.println(loc2.quartos); // 1
	    System.out.println(loc2.garagem); // 1 (carro)
	    // variáveis
	    System.out.println(loc2.prazo()); // 12 (meses)
	    System.out.println(loc2.valor()); // 400.0
	    System.out.println(loc2.valorCondominio()); // 400.0
	    System.out.println(loc2.valorTotal()); // 800.0
	    System.out.println("===========FIM APARTAMENTO==================");
	    
	    
	    System.out.println("================COMERCIAL====================");
	    Comercial loc3 = new Comercial("Aquidaban, 8350", 0, 0, 1000.0, 500.0);
	    // constantes/imutáveis
	    System.out.println(loc3.endereco); // Aquidaban, 8350
	    // variáveis
	    System.out.println(loc3.prazo()); // 6 (meses)
	    System.out.println(loc3.valor()); // 1000.0
	    // não considera condomínio, mas considera taxa de manutenção na primeira parcela
	    System.out.println(loc3.valorTotal()); // 1500.0

	    System.out.println(loc1.pagar()); // paga 1 mês em dia // 900.0
	    System.out.println(loc2.pagar()); // paga 1 mês em dia // 800.0
	    System.out.println(loc3.pagar()); // paga 1 mês em dia // 1500.0

	    System.out.println(loc1.prazo()); // 11
	    System.out.println(loc2.prazo()); // 11
	    System.out.println(loc3.prazo()); // 5
	    
	    // paga com 1 dia de atraso: multa 3% + 1% ao dia para Residência
	    // se for Apartamento incide multa de 10% sobre o valor do condomínio
	    // multa 5% + 1% ao dia para comercial
	    System.out.println(loc1.pagar(1)); // 900 + 27 + 9 = 936.0
	    System.out.println(loc2.pagar(1)); // 400 + 12 + 4 + 40 = 456.0
	    System.out.println(loc3.pagar(1)); // 1000 + 50 + 10 = 1060.0
	    
	    System.out.println(loc1.prazo()); // 10
	    System.out.println(loc2.prazo()); // 10
	    System.out.println(loc3.prazo()); // 4

	    loc1.renovar(5.0); // percentual reajuste
	    System.out.println(loc1.prazo()); // 12 (meses)
	    System.out.println(loc1.valor()); // 945.0
	    System.out.println(loc1.valorTotal()); // 945.0

	    System.out.println(loc3.pagar()); // 1000.0
	    System.out.println(loc3.pagar()); // 1000.0
	    System.out.println(loc3.pagar()); // 1000.0
	    System.out.println(loc3.prazo()); // 1
	    System.out.println(loc3.pagar()); // 1000.0
	    System.out.println(loc3.prazo()); // 0
	    System.out.println(loc3.pagar()); // 0.0
	    System.out.println(loc3.prazo()); // 0

	    // para comercial há uma taxa de manutenção a ser paga na primeira parcela
	    loc3.renovar(3.0, 600.0);
	    System.out.println(loc3.prazo()); // 6
	    System.out.println(loc3.valor()); // 1030.0
	    System.out.println(loc3.valorTotal()); // 1630.0
	    System.out.println("===========FIM COMERCIAL==================");
    
  }
}