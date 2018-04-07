class Cliente {
  private String nome;
  private CPF cpf;

  Cliente(CPF cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
  }

  CPF cpf() { return cpf; }
  String nome() { return nome; }


}
