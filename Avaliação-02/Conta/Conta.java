class Conta {

	final int numero;
	final int agencia;
	private double saldo;

	Conta(int a, int n){
		this.agencia = a;
		this.numero = n;
		this.saldo = 500.00;

	}
	double saldo(){
		return this.saldo;

	}

	void sacar(double saque){
		if(saque > saldo()) return;
		this.saldo -= saque;
	}
	void depositarEmDinheiro(double depositarEmDinheiro){
		if(depositarEmDinheiro > 1000.00) return;
		this.saldo += depositarEmDinheiro;
	}
	void depositarEmCheque(double depositarEmCheque){
		if(depositarEmCheque > 10000.00)return;
		this.saldo += depositarEmCheque;

	}

}
