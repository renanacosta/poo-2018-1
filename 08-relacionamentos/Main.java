class Main {
  public static void main(String[] args) {

    Temperatura t1 = new Temperatura(19);
    System.out.println(t1); // 19.0°C
    t1 = t1.subir(1); // reatribuir
    System.out.println(t1); // 20.0°C
    ArCondicionado komeco = new ArCondicionado("Komeco", t1);
    ArCondicionado samsung =
      new ArCondicionado("Samsung", t1);

    System.out.println(komeco.temperatura()); // 20
    komeco.aumentarTemperatura();
    System.out.println(komeco.temperatura()); // 21
    komeco.aumentarTemperatura();
    komeco.aumentarTemperatura();
    komeco.aumentarTemperatura(); // 24
    System.out.println(komeco.temperatura());
    System.out.println(samsung.temperatura()); // 20
    samsung.aumentarTemperatura();
    System.out.println(samsung.temperatura()); // 21

    System.out.println(samsung.temp());




    // Coordenada c1 =
    //   new Coordenada(-32.0394251, -52.0910079);
    // System.out.println(c1); // @-32.0394251,-52.0910079

  }
}
