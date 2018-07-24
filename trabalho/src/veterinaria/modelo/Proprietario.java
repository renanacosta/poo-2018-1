package veterinaria.modelo;

public abstract class Proprietario {

	private final String nome;
	private final String CPF;
	
	
	protected Proprietario(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}
	
	
}


