
public class Cliente {

	private String nome;
	private Telefone[] telefones = new Telefone[100];
	// private String telefone;
	// private String telefoneCelular;

	public Cliente(String nome) {
		// CTRL + 1 = gera o atributo (field)
		this.nome = nome;

	}

	// ACCESSOR/GETTER
	public String getNome() {
		return nome;
	}

	/*
	 * public String getTelefone() { return telefone; }
	 * 
	 * public void setTelefone(String telefone) { this.telefone = telefone; }
	 */
	// CTRL + ESPAÇO = toString
	@Override
	public String toString() {
		return this.nome;
	}

	/*
	 * public String getTelefoneCelular() { return telefoneCelular; }
	 * 
	 * public void setTelefoneCelular(String telefoneCelular) { this.telefoneCelular
	 * = telefoneCelular;
	 */

	public void addTelefone(Telefone t) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = t;
				return;
			}
		}
	}

	public Telefone[] getTelefones() {
		int qtd = 0;
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] != null)
				qtd++;

		}
		Telefone[] tels = new Telefone[qtd];

		for (int i = 0, j = 0; i < tels.length; i++) {
			if (telefones[i] != null) {
				tels[j++] = telefones[i];

			}
		}
		return tels;
	}
	public void removeTelefone(Telefone t) {
		for (int i = 0; i < telefones.length; i++) {
			if(telefones[i] == t); {
				telefones[i] = null;
			}
			
		}
	}
}
