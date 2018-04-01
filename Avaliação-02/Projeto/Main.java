class Main {
	public static void main(String[] args) {
		// Radio:
		// marca, potencia, inversor, tipo
		System.out.println("==============================");
		System.out.println("     ACOSTA'S RADIO SYSTEM    ");
		System.out.println("==============================");

		Radio rd = new Radio("Philips", 120, true, "Walkman");

		System.out.println("Marca: " + rd.marca);    // Philips
		System.out.println(rd.marca.equals("Philips")); // true
		System.out.println("Potencia: " + rd.potencia); // 120
    System.out.println(rd.potencia == 120); // true
		System.out.println("Inversor: " + rd.inversor); // true
    System.out.println(rd.inversor == true); // true
		System.out.println("Tipo: " + rd.tipo); // Walkman
    System.out.println(rd.tipo.equals("Walkman")); // true
		// rd.marca = "Philips";
		// System.out.println(rd.marca);    // Philips
		System.out.println("***********************************");
		System.out.println("       Início aumentarVolume       ");
		System.out.println("***********************************");
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 10
		// método! -> operação/ação/comando
		rd.aumentarVolume(); // +1 = 11
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 11
		rd.aumentarVolume(); // +1 = 12
		rd.aumentarVolume(); // +1 = 13
		rd.aumentarVolume(); // +1 = 14
		rd.aumentarVolume(); // +1 = 15
		rd.aumentarVolume(); // +1 = 16
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 16
		rd.aumentarVolume(); // +1 = 17
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 17
		rd.aumentarVolume(); // +1 = 18
		rd.aumentarVolume(); // +1 = 19
		rd.aumentarVolume(); // +1 = 20
		rd.aumentarVolume(); // +1 = ||
		rd.aumentarVolume(); // +1 = ||
		//como ja chegou no máximo Repete o mesmo volume 20 q é o MAX.
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 20
		rd.aumentarVolume(); // +1 = ||
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 20

		System.out.println("***********************************");
		System.out.println("         Fim aumentarVolume        ");
		System.out.println("***********************************");

		System.out.println();

		System.out.println("***********************************");
		System.out.println("       Início diminuirVolume       ");
		System.out.println("***********************************");
		rd.diminuirVolume(); // -1
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 19

		rd.diminuirVolume(); // -1 = 18
		rd.diminuirVolume(); // -1 = 17
		rd.diminuirVolume(); // -1 = 16
		rd.diminuirVolume(); // -1 = 15
		rd.diminuirVolume(); // -1 = 14

		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 14

		rd.diminuirVolume(); // -1 = 13
		rd.diminuirVolume(); // -1 = 12
		rd.diminuirVolume(); // -1 = 11
		rd.diminuirVolume(); // -1 = 10
		rd.diminuirVolume(); // -1 = 9
		rd.diminuirVolume(); // -1 = 8
		rd.diminuirVolume(); // -1 = 7
		rd.diminuirVolume(); // -1 = 6
		rd.diminuirVolume(); // -1 = 5
		rd.diminuirVolume(); // -1 = 4
		rd.diminuirVolume(); // -1 = 3
		rd.diminuirVolume(); // -1 = 2
		rd.diminuirVolume(); // -1 = 1
		rd.diminuirVolume(); // -1 = 0
		rd.diminuirVolume(); // -1 = ||
		rd.diminuirVolume(); // -1 = ||
		// como ja alcançou o volume minimo, repete o valor
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 0
		rd.diminuirVolume(); // -1 = 0
		System.out.println("O VOLUME AGORA É: " + rd.volume()); // 0

		System.out.println("***********************************");
		System.out.println("         Fim diminuirVolume        ");
		System.out.println("***********************************");
		System.out.println();
		// ATÉ AQUI FUNCIONA
		//==========================================================

		System.out.println("***********************************");
		System.out.println("          Início upEstacao         ");
		System.out.println("***********************************");
		System.out.println("A ESTAÇÃO AGORA É: " + rd.estacao()); // 3
		rd.upEstacao(); // +1 = 4
		System.out.println("A ESTAÇÃO AGORA É: " + rd.estacao()); // 5
		rd.upEstacao(); // +1 = 6
		rd.upEstacao(); // +1 = 7
		rd.upEstacao(); // +1 = 8
		rd.upEstacao(); // +1 = 9
		rd.upEstacao(); // +1 = 10
		rd.upEstacao(); // +1 = ||
		System.out.println("A ESTAÇÃO AGORA É: " + rd.estacao()); // 10
		rd.upEstacao(); // +1 = 11
		rd.upEstacao(); // +1 = ||
		rd.upEstacao(); // +1 = // mantem valor maximo
		System.out.println("A ESTAÇÃO AGORA É: " + rd.estacao()); // 10
		System.out.println("***********************************");
		System.out.println("           Fim upEstacao           ");
		System.out.println("***********************************");
		System.out.println();
		System.out.println("***********************************");
		System.out.println("         Início downEstacao        ");
		System.out.println("***********************************");
		rd.downEstacao(); // -1
		System.out.println("A ESTAÇÃO AGORA É: " + rd.estacao()); // 9

		rd.downEstacao(); // -1 = 8
		rd.downEstacao(); // -1 = 7
		rd.downEstacao(); // -1 = 6
		rd.downEstacao(); // -1 = 5
		rd.downEstacao(); // -1 = 4

		System.out.println("A ESTAÇÃO AGORA É: " + rd.estacao()); // 4

		rd.downEstacao(); // -1 = 3
		rd.downEstacao(); // -1 = 2
		rd.downEstacao(); // -1 = 1
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		rd.downEstacao(); // -1 = ||
		// como ja alcançou o estacao minimo, repete o valor
		System.out.println("A ESTAÇÃO AGORA É: " + rd.estacao()); // 1
		rd.downEstacao(); // -1 = 0
		System.out.println("A ESTAÇÃO AGORA É: " + rd.estacao()); // 1

		System.out.println("***********************************");
		System.out.println("          Fim  downEstacao         ");
		System.out.println("***********************************");
		System.out.println("           Fim do programa         ");
		System.out.println("***********************************");
	}
}
