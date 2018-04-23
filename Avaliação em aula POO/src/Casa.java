class Casa extends SuperLocacao {
	
Casa(String endereco, int quartos, int garagem, double valor, double valorCondominio) {

	super(endereco,quartos,garagem,valor,valorCondominio);
  
	this.setPrazo(12);
}

	@Override
	int prazo() {
		return this.getPrazo();
	}
	@Override
	double valor() {
		return this.getValor();
	}
	@Override
	double valorTotal() {
		if (this.getPrazo() == 12) {
			return this.getValor() + this.getValorCondominio();
		}
		return this.getValor();
	}
	@Override
	double valorCondominio() {
		return this.getValorCondominio();
	}
	@Override
	double pagar(int n) {
		double x = valorTotal();
		if (this.getPrazo() >= 1){
			this.setPrazo(this.getPrazo() -1);
			return x + (x * 0.03) + (x * (0.01 * n));
		}
		return 0;
	}
	void renovar(double taxa, double manutencao){
		setValor(this.getValor() + this.getValor() * 0.03);
	    this.setValorCondominio(manutencao);
	    this.setPrazo(12);
	  }

	void renovar(double taxa){
	    setValor(this.getValor() + this.getValor() * 0.05);
	    this.setPrazo(12);
	  }
}