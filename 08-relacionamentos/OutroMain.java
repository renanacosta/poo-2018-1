class OutroMain {
  public static void main(String[] args) {

    Cliente c1 = new Cliente(new CPF("01234567890"), "Israel Duarte");

    System.out.println(c1.cpf()); // 123456
    System.out.println(c1.nome()); // Israel Duarte

    Contrato c2 = new Contrato(new CPF("888833344455"));
    System.out.println(c2.cpf());

  }
}
