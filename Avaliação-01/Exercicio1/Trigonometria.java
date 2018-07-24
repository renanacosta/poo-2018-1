public class Trigonometria {

	static double absoluto(double arredondar){
		if(arredondar < 0){
			return arredondar *= -1;
		}
		return arredondar;
	}
	static double raiz(double valor){
		double raiz, temporario;
		raiz = valor/2;
		do {
			temporario = raiz;
			raiz = (raiz * raiz + valor) / (2 * raiz);
		} while (0.0000001 < absoluto(raiz - temporario));
		return raiz;
	}
	static double potencia(double base, double expoente) {
		double r = base;
		for (int i = 1; i < expoente; i++) {
			r = r * base;
		}
		return(r);
	}


	static double hipotenusa(double lado1, double lado2) {
		double n = Trigonometria.raiz(Trigonometria.potencia(lado1,2) + Trigonometria.potencia(lado2,2));
		return(n);
	}

}


