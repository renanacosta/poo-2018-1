class Main {
  public static void main(String[] args) {
    // OO baseada em CLASSES!
    // Uma CLASSE descreve o Objeto:
    // propriedades constantes ou imutáveis
    // propriedades mutáveis (alteráveis)
    // ações/comportamento/funcionalidade

    // Classe/Tipo   // instanciar/construir/inicializar
    Telefone tel = new Telefone();
    // ddd é uma propriedade/atributo de Telefone
    tel.ddd = "53";
    // assim como numero
    tel.numero = "988773334";

    System.out.println(tel); // imprimir o objeto inteiro!
    System.out.println(tel.ddd);
    System.out.println(tel.numero);
    System.out.println("(" + tel.ddd + ")" + tel.numero);

    tel.ddd = "51"; // ESTADO! Estava 53, agora está 51!
    System.out.println("(" + tel.ddd + ")" + tel.numero);

    Telefone tel2 = new Telefone();
    tel2.numero = "33445566";
    System.out.println("(" + tel2.ddd + ")" + tel2.numero);

    // String[] tel3 = {"54", "988992211"};
    // System.out.println("(" + tel3[0] + ")" + tel3[1]);

    ArCondicionado ac = new ArCondicionado();
    ac.marca = "Komeco";
    // ac.temperatura = 22; // PROIBIDO!
    System.out.println(ac.marca); // Komeco
    System.out.println(ac.temperatura()); // 22
    // ac.temperatura--; // não se faz!
    // método de ArCondicionado
    // é uma ação/operação
    ac.diminuirTemperatura(); // isso se faz!
    System.out.println(ac.temperatura()); // 21
    ac.diminuirTemperatura(); // altera o estado!
    ac.diminuirTemperatura();
    ac.diminuirTemperatura();
    ac.diminuirTemperatura();
    ac.diminuirTemperatura();
    System.out.println(ac.temperatura()); // 17
    // ac.temperatura--; // proibido!
    // inconsistente!
    System.out.println(ac.temperatura()); // 17
    // API/INTERFACE
    ac.aumentarTemperatura();
    System.out.println(ac.temperatura()); // 18













  }
}
