class Locacao {

    // imutáveis

  final char tipo;
  final String endereco;
  final int quartos;
  final int garagem;

  // mutáveis

  private double valor;
  private double extra;
  private int prazo;

  double valorTotal;
  double valorCondominio;


  Locacao(char tipo, String endereco, int quartos, int garagem, double valor, double extra) {

    this.tipo = tipo;
    this.endereco = endereco;
    this.quartos = quartos;
    this.garagem = garagem;
    this.valor = valor;
    this.extra = extra;
    // Enquanto tipo for igual a 'R' e ao mesmo tempo igual a 'A', prazo recebe 12;
    if (tipo == 'R' || tipo == 'A') this.prazo = 12;
        // Enquanto tipo for igual a 'C', prazo recebe 6;
        if (tipo == 'C') this.prazo = 6;
        // if (tipo == 'C') this.prazo = 6;
        // else this.prazo = 12;
        // this.prazo = tipo == 'C ? 6 : 12; // ternário
}

    void renovar(double percentual){
      this.valor += percentual / 100.0 * valor;
      this.prazo = 12;
    }

    void renovar(double percentual, double extra){
      this.valor += percentual / 100.0 * valor;
      this.extra = extra;
      this.prazo = 6;
    }

      double pagar(){
        if(this.prazo <= 0) return 0;
        double valorPago = this.valorTotal();
        this.prazo = this.prazo - 1;
        return valorPago;
      }

      double pagar(int atraso){
        if(this.prazo <= 0) return 0;
        double valorPago = this.valorTotal();
        if(this.tipo == 'C'){
          valorPago += 0.05 * this.valorTotal() + (atraso * 0.01 * this.valorTotal());

        }else{
          valorPago += 0.03 * this.valor + (atraso * 0.01 * this.valor);
        }
          if (this.tipo == 'A'){
            valorPago += 0.1 * this.extra;
          }


        this.prazo = this.prazo - 1;
        return valorPago;
      }

      int prazo(){
          return this.prazo;
          }

          double valor(){
            return this.valor;
          }

          double valorTotal(){
            if (this.tipo == 'A') return this.valor + this.extra;
            if (this.tipo == 'C' && this.prazo == 6)
            return this.valor + this.extra;

            return this.valor;
          }


          double valorCondominio(){
            if (this.tipo == 'A'){
              return this.valorCondominio = this.extra;
            }else{
              return this.extra;
            }
          }


}
