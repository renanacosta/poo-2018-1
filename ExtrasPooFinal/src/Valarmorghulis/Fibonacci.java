package Valarmorghulis;

class Fibonacci {
	private int i;
	private int[] fibonacci = new int[47];

	{
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int j = 2; j < fibonacci.length; j++) {
			fibonacci[j] = fibonacci[j - 1] + fibonacci[j - 2];
		}
	}

	Fibonacci() {
	}

	Fibonacci(Fibonacci o) {
		this.i = o.i;
	}

	Fibonacci(int value) {
		under(value);
	}

	int value() {
		return fibonacci[i];
	}

	void next() {
		i++;
	}

	void previous() {
		if (i == 0)
			return;
		i--;
	}

	void next(int times) {
		if (times < 0)
			return;
		if (times + i >= fibonacci.length)
			times = fibonacci.length - i; // não pode subir mais do que o vaior valor do vetor
		for (int j = 0; j < times; j++) {
			next();
		}
	}

	void previous(int times) {
		if (times + i < 0)
			times = i; // só pode diminuir i vezes
		for (int j = 0; j < times; j++) {
			previous();
		}
	}

	void reset() {
		i = 0;
	}

	void near(int value) {
		for (i = 0; i < fibonacci.length; i++) {
			if (fibonacci[i] == value)
				return;
			if (fibonacci[i] > value)
				break;
		}

		if (abs(fibonacci[i] - value) < abs(fibonacci[i - 1] - value)
				&& abs(fibonacci[i] - value) < abs(fibonacci[i + 1] - value)) {
			return;
		} else if (abs(fibonacci[i + 1] - value) < abs(fibonacci[i] - value)
				&& abs(fibonacci[i + 1] - value) < abs(fibonacci[i - 1] - value)) {
			i = i + 1;
			return;
		} else {
			i = i - 1;
		}
	}

	void under(int value) {
		for (i = 0; i < fibonacci.length; i++) {
			if (fibonacci[i] > value) {
				i = i - 1;
				return;
			}
		}
	}

	void above(int value) {
		for (i = 0; i < fibonacci.length; i++) {
			if (fibonacci[i] > value)
				return;
		}
	}

	boolean less(Object o) {
		Fibonacci novo = (Fibonacci) o;
		return this.value() < novo.value();
	}

	boolean greater(Object o) {
		Fibonacci novo = (Fibonacci) o;
		return this.value() > novo.value();
	}

	int abs(int num) {
		if (num < 0)
			return num *= -1;
		return num;
	}

	@Override
	public String toString() {
		return "" + value();
	}

	@Override
	public boolean equals(Object o) {
		Fibonacci novo = (Fibonacci) o;
		return this.value() == novo.value();
	}
}