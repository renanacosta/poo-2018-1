class Fracao {

	final int numerador;
	final int denominador;
// numerador = 3 e denominador = 5;
	Fracao(int numerador, int denominador) {
		this.numerador = numerador; // 3;
		this.denominador = denominador; // 5;
	}

	Fracao add(Fracao valor) {
		if(valor.denominador!=this.denominador)

			return new Fracao((this.numerador * valor.denominador + valor.numerador *
					this.denominador / mdc(this.denominador, valor.denominador)), valor.denominador *
					this.denominador / mdc(this.denominador, valor.denominador));

		return new Fracao(this.numerador + valor.numerador, this.denominador);
	}

	Fracao add(int y) {
		return new Fracao(y * this.denominador + this.numerador, this.denominador);
	}

	Fracao sub(Fracao valor) {
		if(valor.denominador != this.denominador)

			return new Fracao
					((this.numerador * valor.denominador - valor.numerador * this.denominador)
							/ mdc(this.denominador, valor.denominador), valor.denominador *
							this.denominador / mdc(this.denominador, valor.denominador));

		return new Fracao
				(this.numerador - valor.numerador,this.denominador);
	}

	Fracao mult(Fracao valor) {
		return new Fracao(this.numerador * valor.numerador,
				this.denominador * valor.denominador);
	}

	Fracao div(Fracao valor) {
		return new Fracao(valor.denominador * this.numerador,
				valor.numerador * this.denominador);
	}
// Inversão denominador/numerador;
	Fracao inv() {
		return new Fracao(this.denominador, this.numerador);
	}

	Fracao() {
		this.numerador = 0;
		this.denominador = 1;
		return;
	}

	public int menor(int a, int b) {
		int menor = a < b ? a : b;
		return menor;
	}

	public int mdc(int a, int b) {
		int mdc = menor(a, b);
		while (a % mdc != 0 || b % mdc != 0) {
			mdc = mdc - 1;
		}
		return mdc;
	}

	public boolean equals(Fracao y) {
		return ((this.numerador == y.numerador) && (this.denominador == y.denominador));
	}
}
