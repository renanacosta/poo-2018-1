class Conta {
  final int agencia, numero;
  final char tipo;
  private double saldo;
  private double limite;

  Conta(int agencia, int numero, char tipo) {
    this.agencia = agencia;
    this.numero = numero;
    this.tipo = tipo;
    if (tipo == 'C') this.saldo = 500;
    if (tipo == 'P') this.saldo = 1000;
    if (tipo == 'E') {
      this.saldo = 500;
      this.limite = 1000;
    }
  }

  void depositarEmDinheiro(double valor) {
    if (valor <= 1000) saldo += valor;
  }

  void depositarEmCheque(double valor) {
    if (valor <= 10000) saldo += valor;
  }

  void sacar(double valor) {
    if (tipo == 'E') {
      if (valor > saldoSaque()) return;
    } else if (valor > saldo) {
      return;
    }

    if (tipo == 'P' && valor > 1000) return;

    saldo -= valor;
  }

  double saldo() {
    return this.saldo;
  }

  double limite() {
    return this.limite;
  }

  double saldoSaque() {
    return this.saldo + this.limite;
  }










}
