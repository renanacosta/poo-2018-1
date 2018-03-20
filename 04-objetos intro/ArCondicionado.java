class ArCondicionado {
  // PROPRIEDADES
  private String marca;
  // privado: é acessível apenas dentro de ArCondicionado
  private int t = 22;

  // OPERAÇÕES/AÇÕES/MÉTODOS
  void diminuirTemperatura() {
    if (t > 17) t = t - 1;
  }
  void aumentarTemperatura() {
    if (t < 30) t++;
  }
  // MÉTODO CONSULTA
  int temperatura() {
    return t;
  }







}
