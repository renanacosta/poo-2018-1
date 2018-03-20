public class TesteMorse {
	public static void main (String[]args) {

		
		String alfa = "teste morse";
		String morse = Morse.ToMorse(alfa);
		System.out.println(morse); // "- . ... - . / -- --- .-. ... .";
		// Casos de Teste:
		System.out.println(morse.equals("- . ... - . / -- --- .-. ... ."));
		// maiúsculas
		System.out.println(Morse.ToMorse("TESTE MORSE").equals("- . ... - . / -- --- .-. ... ."));
		// ignorar não a-z, A-Z e espaço
		System.out.println(Morse.ToMorse("2333TESTE 0MORSE__?").equals("- . ... - . / -- --- .-. ... ."));
		System.out.println(Morse.ToMorse("tEsTe morSE").equals("- . ... - . / -- --- .-. ... ."));
		System.out.println(Morse.ToMorse("tadsmorse").equals("- .- -.. ... -- --- .-. ... ."));
		// 3 Testes
		System.out.println(Morse.ToMorse("Código Morse").equals("-.-. -.. .. --. --- / -- --- .-. ... ."));
		System.out.println(Morse.ToMorse("codificando").equals("-.-. --- -.. .. ..-. .. -.-. .- -. -.. ---"));
		System.out.println(Morse.ToMorse("Renan Acosta").equals(".-. . -. .- -. / .- -.-. --- ... - .-"));
	}
}


