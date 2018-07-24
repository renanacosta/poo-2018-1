package barbearia.modelo;

public class Procedimento {

	private final String descricao;
	
	
	public Procedimento(String descricao) {
		this.descricao = descricao;
		
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Procedimento [Descrição: " + descricao + "]";
	}
	
	
	
}
