class Exercicio {
  public static void main(String[] args) {
    // String charAt length
    String s = "teste";
    System.out.println(s.charAt(2)); // s
    System.out.println(s.length()); // 5
    System.out.println(s.equals("teste")); // true

    // especificação
    String t = "  palavra  ";
    String l = Text.trimLeft(t);
    System.out.println(l); // "palavra  "
    System.out.println(l.equals("palavra  "));

    String r = Text.trimRight(t);
    System.out.println(r); // "  palavra"

    String a = Text.trimAll(t);
    System.out.println(a); // "palavra"
    System.out.println(a.equals("palavra"));

    String d = "  p  p  ";
    System.out.println(Text.trimLeft(d).equals("p  p  "));
    System.out.println(Text.trimRight(d).equals("  p  p"));
    System.out.println(Text.trimAll(d).equals("p  p"));

  }
}
