package model;

/**
 *
 * @author Renan Acosta
 */
public class ModelLocalizacao {

	private int id;
	private String cep;
	private String cidade;
	private String endereco;
	private String complemento;

	/**
	 * Construtor
	 */
	public ModelLocalizacao() {
	}

	/**
	 * seta o valor de int
	 * 
	 * @param Id
	 */
	public void setInt(int Id) {
		this.id = Id;
	}

	/**
	 * return id_pk
	 */
	public int getInt() {
		return this.id;
	}

	/**
	 * seta o valor de cep
	 * 
	 * @param Cep
	 */
	public void setCep(String Cep) {
		this.cep = Cep;
	}

	/**
	 * return cep
	 */
	public String getCep() {
		return this.cep;
	}

	/**
	 * seta o valor de cidade
	 * 
	 * @param Cidade
	 */
	public void setCidade(String Cidade) {
		this.cidade = Cidade;
	}

	/**
	 * return cidade
	 */
	public String getCidade() {
		return this.cidade;
	}

	/**
	 * seta o valor de endereco
	 * 
	 * @param Endereco
	 */
	public void setEndereco(String Endereco) {
		this.endereco = Endereco;
	}

	/**
	 * return endereco
	 */
	public String getEndereco() {
		return this.endereco;
	}

	/**
	 * seta o valor de complemento
	 * 
	 * @param Complemento
	 */
	public void setComplemento(String Complemento) {
		this.complemento = Complemento;
	}

	/**
	 * return complemento
	 */
	public String getComplemento() {
		return this.complemento;
	}

	@Override
	public String toString() {
		return "ModelLocalizacao {" + "::int = " + this.id + "::cep = " + this.cep + "::cidade = " + this.cidade
				+ "::endereco = " + this.endereco + "::complemento = " + this.complemento + "}";
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}