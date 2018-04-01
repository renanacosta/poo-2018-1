class ATM{

	final int numeroSerie;
	int [] notas = {5, 10, 20, 50, 100};
	int [] quantidade = {0, 0, 0, 0, 0};


	ATM(int n){
		this.numeroSerie = n;
	}

	int consultarValor(){
		int valor = 0;

		for(int i = 0; i < notas.length; i++) valor += notas[i] * quantidade[i];
		return valor;
	}

	void abastecer(int q, int n){
		for(int i = 0; i < notas.length; i++){
			if(n == notas[i]){
				quantidade[i] += q;
				if(quantidade[i] > 100){
					quantidade[i] = 100;

				}
			}

		}

	}

	int consultarQuantidade(int nota){
		for(int i = 0; i < notas.length; i++){
			if(nota == notas[i]){
				return quantidade[i];
			}
		}
		return 0;
	}

	void retirar(int valor){
		int verNotas = valor;
		int aux = 0;

		for(int i = notas.length - 1; i >= 0; i--){
			aux = verNotas / notas[i];
			if(quantidade[i] < aux) aux = quantidade[i];
			verNotas -= (aux * notas[i]);
		}
		if(verNotas != 0) return;

		for(int i = notas.length - 1; i >= 0; i--){
			if (quantidade[i] > 0){
				aux = valor / notas[i];
				if(quantidade[i] < aux) aux = quantidade[i];
				quantidade[i] -= aux;
				valor -= (aux * notas[i]);
			}
		}

	}

}
