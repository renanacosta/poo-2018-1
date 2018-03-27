public class Main2 {
  public static void main(String[] args) {
      Produto p = new Produto();
      p.descricao = "Parafuso 3x10";
      // p.preco = 0.10;
      // System.out.println(p.preco);
      // double total = p.preco + p.preco + p.preco;
      // System.out.println(total);

      Dinheiro valor1 = new Dinheiro(8, 68); // R$ 8,68
      System.out.println(valor1.reais()); // 8
      System.out.println(valor1.centavos()); // 68
      System.out.println(valor1); // R$ 8,68 // toString():String

      Dinheiro valor2 = new Dinheiro(50); // R$ 50,00
      System.out.println(valor2.reais()); // 50
      System.out.println(valor2.centavos()); // 0
      System.out.println(valor2); // R$ 50,00 (R$ 50,0) TODO: correção dos centavos
      // Vamos de MUTÁVEL ou de IMUTÁVEL
      valor1.somar(valor2); // opção MUTÁVEL!
      System.out.println(valor1); // R$ 58,68
      System.out.println(valor2); // R$ 50,00

      Dinheiro valor3 = new Dinheiro(1, 50);
      System.out.println(valor3); // R$ 1,50

      valor1.somar(valor3);
      System.out.println(valor1.toString()); // R$ 60,18

      Dinheiro valor4 = new Dinheiro(0, 10);
      Dinheiro total = new Dinheiro(); // R$ 0,00
      total.somar(valor4);
      total.somar(valor4);
      total.somar(valor4);
      System.out.println(total); // R$ 0,30

  }
}

class Dinheiro {
  private long centavos; // sem final! mutável!

  Dinheiro() {}

  Dinheiro(int reais) {
    this.centavos = reais * 100;
  }

  Dinheiro(int reais, int centavos) {
    this.centavos = reais * 100 + centavos;
  }

  int reais() { // consulta
    return (int) (this.centavos / 100);
  }

  int centavos() { // consulta
    return (int) (this.centavos % 100);
  }
  // MUTÁVEL
  void somar(Dinheiro valor) {
    this.centavos += valor.centavos;
  }

  @Override
  public String toString() { // toString
    return "R$ " + this.reais() + "," + this.centavos();
  }
}

class Produto {
  String descricao;
  Dinheiro preco;
}
