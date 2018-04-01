class Main {
	public static void main(String[] args) {

    System.out.println("==============================");
    System.out.println("         MINHA CONTA          ");
    System.out.println("==============================");

		Conta minhaConta = new Conta(3300, 33345);
		System.out.println(minhaConta.agencia == 3300);
		System.out.println(minhaConta.numero == 33345);

		// a seguinte linha não deve compilar, comente-a
		//minhaConta.numero = 92932334;
		// saldo inicial de 500
		System.out.println(minhaConta.saldo()); // 500.0
		System.out.println(minhaConta.saldo() == 500.00);
		// não é permitido
		minhaConta.sacar(600.00);
		System.out.println(minhaConta.saldo()); // 500.0
		System.out.println(minhaConta.saldo() == 500.00);
		// é permitido
		minhaConta.sacar(60.00); // 500.0 - 60.0 == 440.0
		System.out.println(minhaConta.saldo()); // 440.0
		System.out.println(minhaConta.saldo() == 440.00);
		// essa linha não deve compilar, comente-a:
		//minhaConta.saldo = 1000000;
		// depósito em dinheiro não permitido
		minhaConta.depositarEmDinheiro(1100.00);
		System.out.println(minhaConta.saldo()); // 440.0
		System.out.println(minhaConta.saldo() == 440.00);
		// depósito em dinheiro permitido
		minhaConta.depositarEmDinheiro(500.00); // 440.0 + 500.0 == 940.0
		System.out.println(minhaConta.saldo()); // 940.0
		System.out.println(minhaConta.saldo() == 940.00);
		// depósito em cheque não permitido
		minhaConta.depositarEmCheque(11100.00);
		System.out.println(minhaConta.saldo()); // 940.0
		System.out.println(minhaConta.saldo() == 940.00);
		// depósito em cheque permitido
		minhaConta.depositarEmCheque(5000.00); // 940.0 + 5000.0 == 5940.0
		System.out.println(minhaConta.saldo()); // 5940.0
		System.out.println(minhaConta.saldo() == 5940.00);

	}
}
