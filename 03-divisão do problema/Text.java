class Text {
static char upcase(char c) {

  if (isLower(c)) return (char) (c - 32);
  return c;
/*  static String upcase(String s) {
String r = "";
// percorre a string de entrada
for (int i = 0; i < s.length(); i++) {
  // pergunta se é minúscula
  if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
    // converte para maiúscula
    r = r + (char)(s.charAt(i) - 32);
  } else {
    // copia como está
    r = r + s.charAt(i);

  }
}

return r;
*/
  }
  static boolean isLower(char c) {
    if (c >= 'a' && c <= 'z') return true;
    return false;
// pode ser assim: return c >= 'a' && c <= 'z';
}
static String upcase(String s) {
  String r = "";
  for (int i = 0; i < s.length(); i++) {
    r += upcase(s.charAt(i));
  }
  return r;
}

}
