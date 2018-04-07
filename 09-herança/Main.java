class Main {
  public static void main(String[] args) {
    System.out.println("ok ...");
    Conta minhaConta =
      new Conta(3300, 33345, 'C');
    System.out.println(minhaConta.agencia == 3300);
    System.out.println(minhaConta.numero == 33345);
    // a seguinte linha não deve compilar, comente-a
    // minhaConta.numero = 92932334;
    // saldo inicial de 500
    System.out.println(minhaConta.saldo()); // 500.0
    System.out.println(minhaConta.saldo() == 500.0);
    // não é permitido
    minhaConta.sacar(600.0);
    System.out.println(minhaConta.saldo()); // 500.0
    System.out.println(minhaConta.saldo() == 500.0);
    // é permitido
    minhaConta.sacar(60.0); // 500.0 - 60.0 == 440.0
    System.out.println(minhaConta.saldo()); // 440.0
    System.out.println(minhaConta.saldo() == 440.0);
    // essa linha não deve compilar, comente-a:
    // minhaConta.saldo = 1000000;
    // depósito em dinheiro não permitido
    minhaConta.depositarEmDinheiro(1100.0);
    System.out.println(minhaConta.saldo()); // 440.0
    System.out.println(minhaConta.saldo() == 440.0);
    // depósito em dinheiro permitido
    minhaConta.depositarEmDinheiro(500.0); // 440.0 + 500.0 == 940.0
    System.out.println(minhaConta.saldo()); // 940.0
    System.out.println(minhaConta.saldo() == 940.0);
    // depósito em cheque não permitido
    minhaConta.depositarEmCheque(11100.0);
    System.out.println(minhaConta.saldo()); // 940.0
    System.out.println(minhaConta.saldo() == 940.0);
    // depósito em cheque permitido
    minhaConta.depositarEmCheque(5000.0); // 940.0 + 5000.0 == 5940.0
    System.out.println(minhaConta.saldo()); // 5940.0
    System.out.println(minhaConta.saldo() == 5940.0);

    Conta outra = new Conta(663, 32423, 'P');
    outra.depositarEmCheque(10000);
    System.out.println(outra.saldo()); // 11000
    outra.sacar(1000);
    System.out.println(outra.saldo()); // 10000
    outra.sacar(1001);
    System.out.println(outra.saldo()); // 10000

    Conta esp = new Conta(263, 78878, 'E');
    System.out.println(esp.saldo()); // 500
    System.out.println(esp.limite()); // 1000
    System.out.println(esp.saldoSaque()); // 1500
    esp.sacar(1200);
    System.out.println(esp.saldo()); // -700
    System.out.println(esp.saldoSaque()); // 300












  }
}
