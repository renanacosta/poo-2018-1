package clinica.modelo;

public abstract class Pessoa {

	private final String nome;
	private final String CPF;
	
	// protected: as filhas podem acessar
	protected Pessoa(String nome, String CPF) {
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










