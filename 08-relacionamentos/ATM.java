class ATM {
  final int numeroSerie;
  private int ced5, ced10, ced20, ced50, ced100;

  ATM(int numeroSerie) {
    this.numeroSerie = numeroSerie;
  }

  int consultarValor() {
    return ced5  * 5  + ced10  * 10 + ced20 * 20
         + ced50 * 50 + ced100 * 100;
  }

  int consultarQuantidade(int ced) { // 1
    switch (ced) {
      case 5: return ced5;
      case 10: return ced10;
      case 20: return ced20;
      case 50: return ced50;
      case 100: return ced100;
    }
    return 0;
  }

  void abastecer(int qtd, int ced) {
    switch (ced) {
      case 5: ced5 += qtd; break;
      case 10: ced10 += qtd; break;
      case 20: ced20 += qtd; break;
      case 50: ced50 += qtd; break;
      case 100: ced100 += qtd; break;
    }
  }

  void retirar(int valor) {
    int qtd100 = 0;
    int qtd50  = 0;
    int qtd20  = 0;
    int qtd10  = 0;
    int qtd5   = 0;
    int ced5 = this.ced5;

    while (this.ced100 > 0 && valor >= 100) {
      this.ced100--;
      qtd100++;
      valor -= 100;
    }

    while (this.ced50 > 0 && valor >= 50) {
      this.ced50--;
      qtd50++;
      valor -= 50;
    }

    while (this.ced20 > 0 && valor >= 20) {
      this.ced20--;
      qtd20++;
      valor -= 20;
    }

    while (this.ced10 > 0 && valor >= 10) {
      this.ced10--;
      qtd10++;
      valor -= 10;
    }

    while (this.ced5 > 0 && valor >= 5) {
      this.ced5--;
      qtd5++;
      valor -= 5;
    }

    if (valor > 0) {
      this.ced100 += qtd100;
      this.ced50  += qtd50;
      this.ced20  += qtd20;
      this.ced10  += qtd10;
      this.ced5   += qtd5;
    }

  }









}
