class Exercicio3 {
public static void main(String[] args) {

  String s = "aula";
  int n = 10;
  char c = '-';

  String resp = Texto.preenche(s,n,c);
// Caso de Teste (assertiva)
  System.out.println(resp.equals("aula------"));
  System.out.println(Texto.preenche("informatica", 6, '*').equals("informatica"));


  }
}
