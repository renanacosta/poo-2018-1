class ArCondicionado {
  final String marca;
  private Temperatura t;

  ArCondicionado(String marca, Temperatura temp) {
    this.marca = marca;
    this.t = temp;
  }

  void diminuirTemperatura() {
    if (t.valor() > 17) t = t.descer(1);
  }

  void aumentarTemperatura() {
    if (t.valor() < 30) t = t.subir(1);
  }

  int temperatura() {
    return (int) t.valor();
  }

  Temperatura temp() {
    return t;
  }







}
