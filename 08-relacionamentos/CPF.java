class CPF {
  private String numero;

  CPF(String numero) {
    if (numero.length() != 11) {
      // lançar uma exceção
      throw new RuntimeException("cpf não tem 11 digítos");
    }
    for (int i = 0; i < numero.length(); i++) {
      if (numero.charAt(i) < 48 || numero.charAt(i) > 57) {
        throw new RuntimeException("cpf inválido " + numero);
      }
    }
    this.numero = numero;
  }

  @Override
  public String toString() {
    return numero;
  }
}
