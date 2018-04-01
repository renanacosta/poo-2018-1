class Porta {

	final String material;
	final int largura;
	final int altura;
	boolean aberto;
	boolean fechado;
	boolean trancado;

	Porta(int l, int a, String m){
		this.largura = l;
		this.altura = a;
		this.material = m;
		fechar();
		destrancar();
	}
	/*
	void status(){

		System.out.println("Material: " + this.material);
                System.out.println("Largura " + this.largura);
                System.out.println("Altura " + this.altura);
                System.out.println("Está trancada? " + this.trancada);

	}
	 */

	void fechar(){

		this.aberto = false;
		this.fechado = true;
	}

	void abrir(){
		if(this.trancado == true) return;
		this.aberto = true;
		this.fechado = false;

	}

	void trancar(){
		if(this.aberto == true) return;
		this.trancado = true;

	}

	boolean trancada(){
		return this.trancado;
	}

	boolean aberta(){
		return this.aberto;
	}

	boolean fechada(){
		return this.fechado;
	}

	void destrancar(){
		if(this.aberto == true) return;
		this.trancado = false;

	}

}
