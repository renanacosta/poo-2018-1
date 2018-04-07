
// Temperatura é IMUTÁVEL (todos os atributos são final)
class Temperatura {
  private final double valor;

  Temperatura(double v) {
    this.valor = v;
  }

  double valor() {
    return this.valor;
  }
  // operar criando uma nova!
  Temperatura subir(double q) {
    Temperatura nova = new Temperatura(this.valor + q);
    return nova;
  }

  Temperatura descer(double q) {
    return new Temperatura(this.valor - q);
  }

  @Override // sobrescrevendo o toString
  public String toString() {
    return this.valor + "°C";
  }





}
