import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

class Exercicio2 {

// montar método: trecho de lógica reutilizável
                    // declaração dos parâmetros
                    //(entrada: dois inteiros)
  // saída: int (AGORA ELE É TESTÁVEL!!!)
static int potencia(int base, int expoente){
  int resp = base;
  for (int i = 1; i < expoente; i++) {
    resp = resp * base;
  }
  return resp;
  }

public static void main(String[] args) {
  System.out.println("funcionando...!");
int base = parseInt(showInputDialog("base:"));
int expoente = parseInt(showInputDialog("expo:"));
// chamando/invocando o método potencia
        // argumentos
int r = potencia (base, expoente);
showMessageDialog(null, r);
System.out.println(r);
System.out.println(potencia(3,3));// 27
System.out.println(potencia(4,2));// 16

// Caso de Teste
// assertiva (afirmação: experssão booleana)
System.out.println(potencia(3,3) == 27);
System.out.println(potencia(4,2) == 16);
System.out.println(potencia(2,11) == 2048);
System.out.println(potencia(3,1) == 3);
System.out.println(potencia(3,0) == 1);
System.out.println(potencia(2,-5));// inválido
  }
}
