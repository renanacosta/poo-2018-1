// Modelo de Ar Condicionado; é simplificado!
// ABSTRAÇÃO
// Abstrair: é ignorar os detalhes que não são relevantes
//  + abstrato: menos detalhes
//  + concreto: mais detalhes (mais específico)

class ArCondicionado {

  String marca;
  private int t = 22;

  void diminuirTemperatura() {
    if (t > 17) t = t - 1;
  }

  void aumentarTemperatura() {
    if (t < 30) t++;
  }

  int temperatura() {
    return t;
  }
}
