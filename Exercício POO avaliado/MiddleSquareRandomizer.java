package Randomizer;

public class MiddleSquareRandomizer implements Randomizer {
	private long semente;
	private long quadrado;
	//D� uma olhada no main! eu j� deixei prontinho la pra vc testar
	//� s� tirar do comentario la o Sysout
	public long getSemente() {
		return semente;
	}
	// Como disse, estava com duvidas quanto aos get sets!
	// Ent�o, como set semente n�o � usado no nosso Algoritmo, n�o fiz

	public long getQuadrado() {
		return quadrado;
	}

	public void setQuadrado(long quadrado) {
		this.quadrado = quadrado;
	}

	public double random() {
		setQuadrado(this.getSemente() * this.getSemente());
		setQuadrado((this.getQuadrado() / 1000) % 1000000); 
		/* Divindo por 1000 a gente corta os numeros � direita dele
		 * no caso, 455959861504 (quadrado de 675248) vira 455959861
		 * Depois quando a gente faz % 1000000 ele corta os numeros 
		 * � esquerda, de 959861(resultado da divis�o por 1000) ele vira 
		 * 959861 o numero que queremos, e essa regra funciona para todos 
		 * os numeros (acho eu, testei varios numeros kkkk).
		 */
		double valor = (double) this.getQuadrado() / 1000000;
		/*aqui apenas pegamos a parte decimal dele, dado que tem que
		 * estar entre 0.0 e 0.99999999... ne
		 */
		this.semente++;
		return valor;
	}

	@Override
	public int randomInt(int max) {
		MiddleSquareRandomizer c = new MiddleSquareRandomizer();
		return (int) (random() * max + 1);
	}
	/* Outra coisa que arrumei, inicialmente coloquei 
	 * random * max() s�, s� que ele n�o chegava nunca aos 17
	 * e quase te mandei assim, s� depois fazendo os System.out.println(true) la
	 * que eu vi. A regra aqui � tu multiplicar ele, depois tu
	 * coloca + 1 porque ele vai arredondar como int kkkkkkkkk(obvio ne)
	 * dai, por ex, 0.999999 viraria 0, por isso sempre tem que colocar +1
	 * na primeira geramos valores entre 0 e 1, agora multiplicamos os
	 * valores pelo max, e adicionamos 1, se n�o, no teu exemplo,
	 * nunca daria 17, ele sempre ficaria em 16.842... por ex
	 */

	@Override
	public int randomInt(int min, int max) {
		return randomInt(max - min) + min;
		/* Para pegar o intervalo entre os valores, basta
		 * diminuir o max de mim + min
		 * ex: min 51 max 17
		 * max 0 min = 36, + min  = 54
		 * TODAVIA, como esses valores SEMPRE ser�o arredondados
		 * o max ser� -1 no final, o min ser� -1 no final, e o que adicionamos tamb�m
		 * teremos max - min = 36 + min = 54 - 3 dos arredondamentos
		 * porque ele sempre arredonda pra baixo sabe um cast for�ado
		 * de double 0.999999999999 para int, vira 0
		 */
		
		//E � isso!
	}

}
