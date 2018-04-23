abstract class SuperLocacao {
  
	
	int quartos,garagem;
	String endereco;
	int prazo;
	double valor,valorTotal,valorCondominio,x;

	SuperLocacao(String endereco, int quartos, int garagem, double valor, double valorCondominio){
    
	this.endereco = endereco;
    this.quartos = quartos;
    this.garagem = garagem;
    this.setValor(valor);
    this.setValorCondominio(valorCondominio);

  }


	int getPrazo() {
	return prazo;
}

	void setPrazo(int prazo) {
	this.prazo = prazo;
}
		abstract int prazo();
		abstract double valor();
		abstract double valorTotal();
		abstract double valorCondominio();
		abstract double pagar(int n);

		double pagar() {
			double x = valorTotal();
			if (this.getPrazo() >= 1){
				this.setPrazo(this.getPrazo() -1);
				return x;
	}
	return 0;
}

public double getValor() {
	return valor;
}


public void setValor(double valor) {
	this.valor = valor;
}


public double getValorCondominio() {
	return valorCondominio;
}


public void setValorCondominio(double valorCondominio) {
	this.valorCondominio = valorCondominio;
}


public double getValorTotal() {
	return valorTotal;
}


public void setValorTotal(double valorTotal) {
	this.valorTotal = valorTotal;
}


public double getx() {
	return x;
}


public void setx(double x) {
	this.x = x;
}

}