class Exercicio{
	public static void main(String[] args) {
		
	
	// String charAt, length, equals
    String s = "teste";
    System.out.println(s.charAt(2));       // s
    System.out.println(s.length());        // 5
    System.out.println(s.equals("teste")); // true

    // especificação
    String t = "  palavra  ";
    String l = Texte.trimLeft(t);
    System.out.println(l); // "palavra  "
    System.out.println(l.equals("palavra  "));

    String r = Texte.trimRight(t);
    System.out.println(r); // "  palavra"
    System.out.println(r.equals("  palavra"));

    String a = Texte.trimAll(t);
    System.out.println(a); // "palavra"
    System.out.println(a.equals("palavra"));

    String d = "  p  p  ";
    System.out.println(Texte.trimLeft(d).equals("p  p  "));
    System.out.println(Texte.trimRight(d).equals("  p  p"));
    System.out.println(Texte.trimAll(d).equals("p  p"));










  }
}