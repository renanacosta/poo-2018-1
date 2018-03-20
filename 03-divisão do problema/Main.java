class Main {
  public static void main(String[] args) {

    char l = 'a';
    System.out.println(Text.upcase(l) == 'A');
    System.out.println(Text.upcase('u') == 'U');
    System.out.println(Text.upcase('1') == '1');
    System.out.println(Text.upcase('@') == '@');
    System.out.println(Text.upcase('z') == 'Z');



    //String a = "Texto Teste";
    // TEXTO TESTE
    //System.out.println(Text.upcase(a));
    //System.out.println(Text.upcase(a).equals("TEXTO TESTE"));
    //
    // String b = "POO 2Sem";
    // // POO 22Sem
    //
    // System.out.println(Text.downcase(b));
    // System.out.println(Text.downcase(b).equals("poo 2sem"));
    //
    // String c = "orientado a objetos";
    // System.out.println(Text.capitalize(c));
    // System.out.println(Text.capitalize(c).equals("Orientado a objetos"));
    // System.out.println(Text.capitalize("uM teXto").equals("Um texto"));

// CAPITALIZE - bota a inicial em maiuscula, e o restante tudo minuscula
/*
    ]System.out.println(a.toUpperCase()); // Transforma tudo maiuscula
    System.out.println(a.toLowerCase()); // Transforma tudo minuscula
*/

  }
}
