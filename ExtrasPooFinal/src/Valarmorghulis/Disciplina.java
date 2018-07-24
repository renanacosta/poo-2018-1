package Valarmorghulis;

class Disciplina {

	public Nota[] notas = { new Nota(0, 0), new Nota(0, 0), new Nota(0, 0), new Nota(0, 0) };
	final String nome;
	private boolean estaAprovado, estaReprovado;
	private Nota exame = new Nota(0, 0);

	Disciplina(String nome) {
		this.nome = nome;
	}

	void nota(int bimestre, Nota nota) {
		if (bimestre < 0 || bimestre > 4)
			return;
		this.notas[bimestre - 1] = new Nota(nota.inteiro(), nota.fracao());
	}

	Nota pontos() {
		return new Nota(notaInteiro() / 10, notaInteiro() % 10);
	}

	Nota media() {
		int teste = (int) ((double) notaInteiro() / 10 / 4 * 100 / 10) % 10;
		int teste2 = (int) ((double) notaInteiro() / 10 / 4 * 10) % 10;
		if (notaInteiro() / 10 / 4 >= 7) {
			this.estaAprovado = true;
			this.estaReprovado = false;
		} else {
			this.estaAprovado = false;
			this.estaReprovado = true;
		}
		if (teste >= 3 || teste == 0) {
			return new Nota(notaInteiro() / 10 / 4, notaInteiro() % 10 / 4 + teste2);
		}
		return new Nota(notaInteiro() / 10 / 4, notaInteiro() % 10 / 4 + teste2 + 1);
	}

	boolean estaAprovado() {
		return this.estaAprovado;
	}

	boolean estaReprovado() {
		return this.estaReprovado;
	}

	Nota notaNecessariaExame() {
		if (this.media().toDouble() < 7) {
			int temp = pontos().inteiro() * 10 + pontos().fracao();
			int exame = exame().inteiro() * 10 + exame().fracao();
			for (exame = 21; exame < 100; exame++) {
				if (((temp * 6 / 4) + (exame * 4)) / 10.0 >= 50) {
					return new Nota(exame / 10, exame % 10);
				}
			}
		}
		return new Nota(0, 0);
	}

	Nota nota(int index) {
		if (index < 0 || index > 4)
			return null;
		return this.notas[index - 1];
	}

	String estado() {
		if (this.estaAprovado == true) {
			return "APR";
		} else {
			return "REP";
		}
	}

	Nota final1() {
		if (!this.estaAprovado && media().toDouble() > 4 && exame.toDouble() != 0) {
			int temp = pontos().inteiro() * 10 + pontos().fracao();
			int exame = exame().inteiro() * 10 + exame().fracao();
			int final1 = (int) (((temp * 6 / 4) + (exame * 4)) / 10.0);
			if (final1 > 50) {
				this.estaAprovado = true;
				this.estaReprovado = false;
			} else {
				this.estaAprovado = false;
				this.estaReprovado = true;
			}
			return new Nota(final1 / 10, final1 % 10);
		}
		return new Nota(0, 0);
	}

	@Override
	public String toString() {
		return this.nome + " 1:" + notas[0].toDouble() + " 2:" + notas[1].toDouble() + " 3:" + notas[2].toDouble()
				+ " 4:" + notas[3].toDouble() + " T:" + pontos().toDouble() + " M:" + media().toDouble() + " E:"
				+ exame().toDouble() + " F:" + final1().toDouble() + " " + estado();
	}

	public boolean equals(Nota o) {
		Nota nota = (Nota) o;
		return this.notas[0] == nota;
	}

	int notaInteiro() {
		int intTemp = 0;
		int fracaoTemp = 0;
		for (int i = 0; i < notas.length; i++) {
			intTemp += notas[i].inteiro();
			fracaoTemp += notas[i].fracao();
		}
		intTemp = intTemp + (fracaoTemp / 10);
		fracaoTemp = fracaoTemp % 10;
		return intTemp * 10 + fracaoTemp;
	}

	Nota exame() {
		return this.exame;
	}

	Nota exame(Nota nota) {
		Nota notaExame = (Nota) nota;
		this.exame = new Nota(notaExame.inteiro(), notaExame.fracao());
		return this.exame;
	}
}