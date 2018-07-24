package model;

/**
 *
 * @author Renan Acosta
 */
public class ModelAplicativo {

	private String nome;
	private String cnpj;
	private String razaoSocial;

	/**
	 * Construtor
	 */
	public ModelAplicativo() {
	}

	/**
	 * seta o valor de nome
	 * 
	 * @param Nome
	 */
	public void setNome(String Nome) {
		this.nome = Nome;
	}

	/**
	 * return nome
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * seta o valor de cnpj
	 * 
	 * @param Cnpj
	 */
	public void setCnpj(String Cnpj) {
		this.cnpj = Cnpj;
	}

	/**
	 * return cnpj
	 */
	public String getCnpj() {
		return this.cnpj;
	}

	/**
	 * seta o valor de razaoSocial
	 * 
	 * @param RazaoSocial
	 */
	public void setRazaoSocial(String RazaoSocial) {
		this.razaoSocial = RazaoSocial;
	}

	/**
	 * return razaoSocial
	 */
	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	@Override
	public String toString() {
		return "ModelAplicativo {" + "::nome = " + this.nome + "::cnpj = " + this.cnpj + "::razaoSocial = "
				+ this.razaoSocial + "}";
	}
}