class MainATM {
  public static void main(String[] args) {
    // IDENTIDADA +OU- CHAVE
    ATM atm = new ATM(2344499);
    System.out.println(atm.numeroSerie == 2344499);
    // a linha a seguir não compila, comente-a
    // atm.numeroSerie = 34883444;
    // o ATM não tem dinheiro no início
    System.out.println(atm.consultarValor()); // 0
    System.out.println(atm.consultarValor() == 0);

    // abastecendo com 33 notas de 100
    atm.abastecer(33, 100);
    // verificando a quantidade de cédulas de 100
    System.out.println(atm.consultarQuantidade(100)); // 33

    // espera-se 33 cédulas
    System.out.println(atm.consultarQuantidade(100) == 33);
    // espera-se nenhuma cédula de qualquer outro valor
    System.out.println(atm.consultarQuantidade(5)); // 0
    System.out.println(atm.consultarQuantidade(5) == 0);
    System.out.println(atm.consultarQuantidade(50)); // 0
    System.out.println(atm.consultarQuantidade(50) == 0);
    // mesmo os que não existem podem ser consultados, mas retornam 0
    System.out.println(atm.consultarQuantidade(3)); // 0
    System.out.println(atm.consultarQuantidade(3) == 0);
    // abastecimento de cédulas não existentes são rejeitados
    atm.abastecer(8, 3); // 8 cédulas de R$ 3,00
    System.out.println(atm.consultarQuantidade(3) == 0);
    // consultando o valor
    System.out.println(atm.consultarValor()); // 33 * 100 = 3300 reais
    System.out.println(atm.consultarValor() == 3300);

    // retirada rejeitada
    atm.retirar(350); // não há cédulas de R$ 50,00

    System.out.println(atm.consultarQuantidade(100) == 33);
    System.out.println(atm.consultarValor() == 3300);
    // retirada válida
    atm.retirar(300); // 3 cédulas de 100
    System.out.println(atm.consultarQuantidade(100) == 30);
    System.out.println(atm.consultarValor() == 3000);
    // retirada rejeitada
    atm.retirar(3100); // não há cédulas suficientes
    System.out.println(atm.consultarQuantidade(100) == 30);
    System.out.println(atm.consultarValor() == 3000);

    // retirada válida
    atm.retirar(3000); // vai esvaziar o ATM
    System.out.println(atm.consultarQuantidade(100) == 0);
    System.out.println(atm.consultarValor() == 0);
    // abastecimento de R$ 50,00 e R$ 10,00
    atm.abastecer(10, 10); // 10 cédulas de R$ 10,00
    atm.abastecer(10, 50); // 10 cédulas de R$ 50,00
    System.out.println(atm.consultarQuantidade(10));
    System.out.println(atm.consultarQuantidade(10) == 10);
    System.out.println(atm.consultarQuantidade(50) == 10);
    System.out.println(atm.consultarValor()); // 10 * 10
    System.out.println(atm.consultarValor() == 600); // 10 * 10

    // retirada prioriza cédulas de maior valor
    atm.retirar(100); // retira 2 cédulas de R$ 50,00
    System.out.println(atm.consultarQuantidade(10) == 10);
    System.out.println(atm.consultarQuantidade(50) == 8);
    System.out.println(atm.consultarValor() == 500); // 10 * 10 + 8 * 50
    // retirada combinada
    atm.retirar(90); // 1 cédula de R$ 50,00 e 4 cédulas de R$ 10,00
    System.out.println(atm.consultarQuantidade(10) == 6);
    System.out.println(atm.consultarQuantidade(50) == 7);
    System.out.println(atm.consultarValor() == 410); // 6 * 10 + 7 * 50
    // incluir casos de teste pessoais com retiradas
    // quem combinam 3, 4 e 5 cédulas
    // ---------------------------------------------------


  }
}
