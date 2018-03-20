import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

class Exercicio {

// montar método: trecho de lógica reutilizável
                    // declaração dos parâmetros
                    //(entrada: dois inteiros)
  // saída: nada
static void potencia(int base, int expoente){
  int resp = base;
  for (int i = 1; i < expoente; i++) {
    resp = resp * base;
  }
  showMessageDialog(null, resp);
}

public static void main(String[] args) {
  System.out.println("funcionando...!");
int base = parseInt(showInputDialog("base:"));
int expoente = parseInt(showInputDialog("expo:"));
// chamando/invocando o método potencia
        // argumentos
potencia (base, expoente);
potencia (3,3);





  }
}
