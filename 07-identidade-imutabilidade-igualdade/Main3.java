public class Main3 {
  public static void main(String[] args) {
    // imutável
    Data d1 = new Data(26, 3, 2018);
    System.out.println(d1); // 26/3/2018
    System.out.println(d1.dia == 26);
    System.out.println(d1.mes == 3);
    System.out.println(d1.ano == 2018);
    Data d2 = d1.adicionarDias(3);
    System.out.println(d1); // 26/3/2018
    System.out.println(d2); // 29/3/2018 NÃO VAI ACONTECER
    Data d3 = d2.adicionarDias(3);
    System.out.println(d3); // 1/4/2018
    d3 = d3.adicionarDias(3);
    System.out.println(d3); // 4/4/2018

    Data h = new Data(26, 3, 2018);
    System.out.println(h); // 26/3/2018
    h = h.amanha(); // 1 dia
    System.out.println(h); // 27/3/2018

  }
}

class Data {

  private int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  // se Data tem todos os atributos final
  // então ela é imutável!
  final int dia, mes, ano;

  Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  // adicionar dias cria uma nova data
  Data adicionarDias(int dias) {
    Data r = new Data(this.dia, this.mes, this.ano);
    for (int i = 0; i < dias; i++) r = r.amanha();
    return r;
  }

  Data amanha() {
    int dia = this.dia;
    int mes = this.mes;
    int ano = this.ano;
    dia++;
    if (dia > this.meses[mes - 1]) {
      dia = 1;
      mes++;
      if (mes > 12) {
        mes = 1;
        ano++;
      }
    }
    return new Data(dia, mes, ano);
  }

  @Override
  public String toString() {
    return this.dia + "/" + this.mes + "/" + this.ano;
  }
}
