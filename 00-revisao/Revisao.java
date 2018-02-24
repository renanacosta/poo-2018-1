// Todo programa Java deve ser "envolto" em uma Classe!
// O nome da classe deve iniciar com letra maiúscula
// O arquivo deve ter o mesmo nome da classe terminando com .java (Ex.: Revisao.java)
class Revisao {
  // Snippet: digite "main" e pressione TAB
  // Todo programa deve ter um método principal (main)
  public static void main(String[] args) {
    // Sequência de instruções:
    // Saída:
    System.out.println("funciona!!!!");
    // instruções
    // declaração de classe, método, etc
    // declaração de variável
    int a;
    // atribuição
    a = 2;
    System.out.println(a);
    // declaração seguida de atribução
    int b = 4; // 4 é um literal inteiro (int)
    // c = 7.7; // não compila
    // int c = 7.7; // não compila
    double c = 7.7; // 7.7 é um literal real (double)
    // existem outros tipos primitivos
    // inteiros: byte, short, int, long
    // reais: float, double
    // caractere: char (int)
    // boolean: true, false
    // tipos primitivos não podem ser null
    boolean d = true;
    System.out.println(d);
    char e = 'P';
    System.out.println(e);
    // coerção
    int f = (int) e;
    System.out.println(f);
    // conversão com perda
    int g = (int) c;
    System.out.println(g);
    // tipos complexos/objetos (em oposição primitivos)
    // strings são declaradas com aspas duplas
    String h = "programação"; // literal string
    System.out.println(h);
    // .charAt(3) é um método de String
    System.out.println(h.charAt(3)); // char 'g'
    // null (nulo) é a ausência de valor
    String k = null;
    System.out.println(k);
    // expressão aritmética
    int l = (4 + 2) * 8;
    System.out.println(l);
    // expressão booleana
    boolean m = true && true && true && false;
    System.out.println(m);
    boolean n = false || false || false || true;
    System.out.println(n);
    // negação
    boolean o = !n;
    System.out.println(o);
    // concatenando (+) string com
    // qualquer outro tipos
    // devolve string
    String p = "poo" + o;
    System.out.println(p);
    // somar um literal inteiro com literal string
    // resulta em string
    System.out.println(4 + "4"); // 44
    // todo if espera um expressão booleana
    if (a > 2) { // if significa "se"
      System.out.println("o a é maior que 2");
    } else { // significa "senão"
      System.out.println("o a não é maior que 2");
    }
    // um if aceita variáveis booleanas
    if (n) {
      System.out.println("n é verdadeiro");
    } else {
      System.out.println("n é falso");
    }
    // if com vários else if
    if (c > 20) {
      System.out.println("c maior que 20");
    } else if (c > 10) {
      System.out.println("c maior que 10");
    } else if (c > 5) {
      System.out.println("c maior que 5");
    } else {
      System.out.println("c é menor 6");
    }
    // switch (seleção caso)
    a = 1; // reatribuindo
    switch (a) {
      case 1: {
        System.out.println("a é 1");
        // nos case's se coloca break
        // para impedir o fallback
        break;
      }
      case 2: {
        System.out.println("a é 2");
      }
      case 3: {
        System.out.println("a é 3");
      }
      default: { // equivalente ao "else" do if
        System.out.println("a não é nem 1, nem 2, nem 3");
      }
    }
    // if constante literal true
    // entra sempre
    if (true) { // chaves criam um bloco
      // cada bloco tem um ESCOPO
      // tudo que existe dentro do bloco
      int q = 0;
      // q existe no bloco do "if"
      System.out.println(q);
      // a existe no bloco do main (escopo do main)
      System.out.println(a);
    }
    // q aqui está fora do escopo
    // System.out.println(q);

    // laços! repetição
    int r = 2;
    // sempre projetar uma condição de saída
    while (r < 10) {
      System.out.println(r);
      r = r + 1; // r += 1; // r++;
    }
    // for/para
    for (int z = 2; z < 10; z = z + 1) {
      System.out.println(z);
    }
    // laço eterno (NÃO FAÇAM ISSO EM CASA)
    // while (true) { // for (;;;) {
    //   System.out.println("teste");
    // }

    // vetores (arrays)
    // [] é o símbolo do vetor (array)
    // vetor de int
    int[] numeros = {3, 7, 9}; // literal
                   //0  1  2 ...
    System.out.println(numeros);
    System.out.println(numeros[1]);
    // comprimento do vetor
    System.out.println(numeros.length);
    //  vetores tem tamanho fixo
    // reatribuindo
    numeros = new int[]{3, 7, 9, 11};
    // atribuir "vazio"
    int[] pares = new int[4];
    System.out.println(pares[0]); // 0
    String[] nomes = new String[10];
    System.out.println(nomes[0]); // null
    nomes[0] = "";
    System.out.println(nomes[0]);










  }
}
