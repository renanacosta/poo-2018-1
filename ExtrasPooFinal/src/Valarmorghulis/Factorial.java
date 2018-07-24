package Valarmorghulis;

class Factorial {

	public static long factorial(int n) {
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static long of(int num) {
		return factorial(num);
	}

	private int number;
	private int fim;

	Factorial(int num) {
		this.fim = num;
	}

	int number() {
		return this.number;
	}

	long value() {
		return factorial(number);
	}

	boolean next() {
		if (number == fim)
			return false;
		this.number++;
		return number <= fim;
	}

	void begin() {
		this.number = 0;
	}

	void end() {
		this.number = this.fim;
	}
}