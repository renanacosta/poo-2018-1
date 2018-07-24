class ATM {

  final int numeroSerie;
  private int[] cedulas;
  private int valor;
  private int p; // posição do vetor
  private int c; // auxiliar no controle de cedulas aceitas
  private boolean valida;

  ATM(int numeroSerie) {
    this.numeroSerie = numeroSerie;
    cedulas = new int [5];
    valor = 0;
  }

  int consultarValor() {
    this.saldo();
    return this.valor;
  }

  int consultarQuantidade(int cedulas) {
    this.cedulasValidas(cedulas);
    return valida ? this.cedulas[this.p]/cedulas : 0;
  }

  void abastecer(int numero, int cedulas) {
	  if (numero <= 0) {
		  throw new IllegalArgumentException(
		  "qtd inválida: " + numero + ", deve ser positivo");
	  }
	  
    this.cedulasValidas(cedulas);
    this.cedulas[this.p] += valida ? numero * cedulas : 0;
  }

  void retirar(int valor) {
    this.saldo();

    if (valor <= this.valor && valor%10 <= this.cedulas[0]
    && (valor/10)%10 <= (this.valor - this.cedulas[4])/10) {
      int x; // auxiliar
      int n = valor; // variavel de controle do valor
      this.c = 100; // cedulas aceitas

      for (int i = this.cedulas.length - 1; i >= 0 && n > 0; i--) {

        if (this.cedulas[i] != 0) {
          x = this.cedulas[i];
          this.cedulas[i] -= this.cedulas[i] > n/c*c ? n/c*c : this.cedulas[i];
          n -= this.cedulas[i] == 0 ? x : n/c*c;
        }

        c = c != 50 ? c/2 : (c/2)-5;
      }
    }
  }

  void cedulasValidas(int cedulas) {
    this.valida = false;
    this.c = 5; // cedulas aceitas
    if (cedulas > 0) {

      for (int i = 0; i < this.cedulas.length && !this.valida; i++) {
        if (cedulas == c) {
          this.valida = true;
          this.p = i;
        } else c = c != 20 ? c*2 : (c*2)+10;
      }
    }
  }

  void saldo() {
    this.valor = 0;
    for (int i = 0; i < cedulas.length; i++) valor += cedulas[i];
  }
  
  @Override
	public String toString() {		
		return      "5: " + consultarQuantidade(5) 
			  +  ", 10: " + consultarQuantidade(10)
			  +  ", 20: " + consultarQuantidade(20)
			  +  ", 50: " + consultarQuantidade(50)
			  + ", 100: " + consultarQuantidade(100);
	}
  
  
  
  
  
  
  
  
  
}
