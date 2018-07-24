class Porta{
  final int largura, altura;
  final String material;

  private boolean aberta=false, fechada=true, trancada=false;

  Porta(int largura, int altura, String material){
    this.largura=largura;
    this.altura=altura;
    this.material=material;
  }

  boolean aberta(){
    return this.aberta;
  }

  boolean fechada(){
    return this.fechada;
  }

  boolean trancada(){
    return this.trancada;
  }

  void abrir(){
	if (this.trancada) {
		throw new IllegalStateException("A porta está trancada e não pode ser aberta");
	}
    if(this.fechada){
      this.aberta=true;
      this.fechada=false;
    }
  }

  void fechar(){
    if(this.aberta){
      this.aberta=false;
      this.fechada=true;
    }
  }

  void trancar(){
    if(this.fechada) this.trancada=true;
  }

  void destrancar(){
    if(this.trancada) this.trancada=false;
  }
}
