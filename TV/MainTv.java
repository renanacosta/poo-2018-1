class MainTv {

public static void main(String[] args) {

  tv = new Tv(42, "LCD", 1920, 1080, true);
  System.out.println(tv.tamanho); // 42
  System.out.println(tv.canal); // 14
  tv.LigarDesligar();
  System.out.println(tv.ligada); // true
tv.irParaCanal(170);
System.out.println(tv.canal); // 14

tv.canal = 170;
System.out.println(tv.canal); // 170

  }
}
