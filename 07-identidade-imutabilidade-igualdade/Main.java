public class Main {
  public static void main(String[] args) {
    Conta minhaConta = new Conta(3300, 33345); // instância
    System.out.println(minhaConta.agencia == 3300);
    System.out.println(minhaConta.numero == 33345);
    // a seguinte linha não deve compilar, comente-a
    // minhaConta.numero = 92932334;
    // saldo inicial de 500
    System.out.println(minhaConta.saldo); // 500.0
    System.out.println(minhaConta.saldo == 500.0);
    minhaConta.depositar(100.0);
    System.out.println(minhaConta.saldo);
    System.out.println(minhaConta.saldo == 600.0);

    Conta outraConta = new Conta(3300, 33345); // instância
    // neste caso: ag e nro IDENTIFICAM a conta!
    System.out.println(outraConta.agencia);
    System.out.println(outraConta.numero);
    // false: porque não é a mesma instância! (para o Java / na memória)
    System.out.println(minhaConta == outraConta);
    System.out.println(minhaConta.equals(outraConta)); // false
    // o objetivo é comparar se eles têm a mesma identidade:


  }
}

// definição da classe
class Conta {
  // atributos (estado) constantes/variáveis
  // agencia e numero IDENTIFICAM a Conta
  final int agencia, numero; // imutável (constante)
  double saldo; // mutável (variável)
  // construtor
  Conta(int ag, int nro) {
    agencia = ag; numero = nro;
    saldo = 500.0;
  }
  // métodos (comportamento) operações/comandos/consultas
  void depositar(double v) {
    this.saldo += v;
  }

  @Override // escrever por cima (sobrescrever)
  public boolean equals(Object o) {
    Conta outra = (Conta) o;
    return this.agencia == outra.agencia && this.numero == outra.numero;
  }




}
