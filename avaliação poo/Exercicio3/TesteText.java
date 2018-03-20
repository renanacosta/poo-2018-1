public class TesteText {

	public static void main(String[] args) {
		
		//Reverse 
		System.out.print("Reverse: ");
		String t1 = "teste";
		String r1 = Text.reverse(t1);
		System.out.println(t1);
		System.out.println(' ');
		//Casos de teste
		System.out.println("Testes de Reverse:");
		System.out.println(r1.equals("etset"));
		System.out.println(Text.reverse("internet das coisas").equals("sasioc sad tenretni"));
		System.out.println(Text.reverse("objeto").equals("otejbo"));
		
		// + dois exemplos teste
		System.out.println(Text.reverse("Renan Acosta").equals("atsocA naneR"));
		System.out.println(Text.reverse("teste de Texto InveRtido").equals("oditRevnI otxeT ed etset"));
		
		//Palindromo
		System.out.println(" Palindromo: ");
		String t2 = "pato";
		boolean r2 = Text.palindrome(t2);
		System.out.println(r2);
		System.out.println(" Testes: ");
		//Casos de teste
		System.out.println(r2 == false);
		System.out.println(Text.palindrome("arara") == true);
		System.out.println(Text.palindrome("a cara rajada da jararaca") == true);
		System.out.println(Text.palindrome(" acuda cadela da leda caduca") == true);
		
		// + dois exemplos teste
		System.out.println(Text.palindrome(" O MITO E OTIMO ") == true);
		System.out.println(Text.palindrome(" a sacada da casa ") == true);
		;
		//Strip
		System.out.println(" Strip: ");
		String t3 = "tads: poo";
		String r3 = Text.strip(t3, ':');
		System.out.println(r3);
		System.out.println(" Testes: ");
		//Casos de Teste
		System.out.println(r3.equals("tads poo"));
		System.out.println(Text.strip(".teste....de.strip..", '.').equals("testedestrip"));
		System.out.println(Text.strip("arara", 'a').equals("rr"));
		System.out.println(Text.strip("analise e desenvolvimento de sistemas", 'e').equals("analis  dsnvolvimnto d sistmas"));
		
		// + dois exemplos teste
		System.out.println(Text.strip("IF RS", ' ').equals("IFRS"));
		System.out.println(Text.strip("   0tt7 ", 't').equals("   07 "));
		
	}
}



