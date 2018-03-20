class Texto {
  static String preenche(String texto, int tamanho, char caractere) {
    int tamTexto = texto.length();
    for (int i = 0; i < tamanho - tamTexto; i++) {
      texto += caractere;

    }
    return texto;

  }
}
