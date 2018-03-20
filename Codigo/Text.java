class Text {
  static String padLeft(String s, int n, char c) {
    int tam = s.length();
    for (int i = 0; i < n - tam; i++) s = c + s;
    return repeat(c, n - s.length()) + s;
  }

    static String padRigth(String s, int n, char c) {
      int tam = s.length();
      for (int i = 0; i < n - tam; i++) s = s + c;
      return s + repeat(c, n - s.length());
    }

    static String repeat(char c, int n) {
      String s = "";
      for (int i = 0; i < n; i++) s += c;
      return s;

    }
}
