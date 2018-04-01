// CLASSE ("molde")
class Radio {
	// características constantes!!! (imutáveis)
	// ATRIBUTO
	final String  marca; // String m;
	final int     potencia; // inteiro p;
	final boolean inversor; // boolean i; / true ou false
	final String tipo; // String t;
	// caracterísicas mutáveis!
	// ESTADO!!!
	boolean ligado = true;

	private int estacao;
	//privdate int estacao = ; // privado!
	private int volume; // privado!

	// constante da classe

	private static final int VOL_MIN = 0; // volume minimo
	private static final int VOL_MAX = 20; // volume maximo

	private static final int EST_MIN = 1; // estação minimo
	private static final int EST_MAX = 10; // estação maximo


	// CONSTRUTOR (inicializar o objeto)
	// NomeDaClasse(parâmetros)
	Radio(String m, int p, boolean i, String t) {

		this.marca = m;
		this.potencia = p;
		this.inversor = i;
		this.tipo = t;

		this.volume = 10;
		this.estacao = 3;


	}
	// OPERAÇÃO/COMANDO
	// método comando!

	void aumentarVolume() {
		if (volume == VOL_MAX) return;
		this.volume ++;
	}
	// CONSULTA
	// método consulta!
	int volume() {
		return this.volume;
	}

	void diminuirVolume() {
		if (volume == VOL_MIN) return;
		this.volume --;
	}

	//================================================

	void upEstacao() {
		if (estacao == EST_MAX) return;
		this.estacao ++;
	}
	// CONSULTA
	// método consulta!
	int estacao() {
		return this.estacao;
	}

	void downEstacao() {
		if (estacao == EST_MIN) return;
		this.estacao --;
	}

}
