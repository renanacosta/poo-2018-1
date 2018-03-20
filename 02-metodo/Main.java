class Main {
  public static void main(String[] args) {
    // especificação
    String r = Text.padLeft("if", 6, '*');
    System.out.println(r); // ****if
    System.out.println(r.equals("****if"));

    String p = Text.padRigth("rs", 6, '#');
    System.out.println(p); // rs####
    System.out.println(p.equals("rs####"));

    String t = Text.repeat('@', 10);
    System.out.println(t); // @@@@@@@@@@
    System.out.println(t.equals("@@@@@@@@@@"));

    
  }
}
