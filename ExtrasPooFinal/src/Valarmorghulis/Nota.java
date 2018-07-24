package Valarmorghulis;

class Nota {

	private int inteiro;
	private int fracao;

	Nota() {
	}

	Nota(int inteiro) {
		this.inteiro = inteiro;
	}

	Nota(int inteiro, int fracao) {
		this(inteiro);
		this.fracao = fracao;
	}

	int inteiro() {
		return this.inteiro;
	}

	int fracao() {
		return this.fracao;
	}

	double toDouble() {
		return this.inteiro + (double) this.fracao / 10;
	}

	boolean less(Object o) {
		Nota nova = (Nota) o;
		return this.toDouble() < nova.toDouble();
	}

	boolean greater(Object o) {
		Nota nova = (Nota) o;
		return this.toDouble() > nova.toDouble();
	}

	@Override
	public String toString() {
		return toDouble() + "";
	}

	@Override
	public boolean equals(Object o) {
		Nota nova = (Nota) o;
		return this.toDouble() == nova.toDouble();
	}
}