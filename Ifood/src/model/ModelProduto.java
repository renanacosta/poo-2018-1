package model;

/**
 *
 * @author Renan Acosta
 */
public class ModelProduto {

	private int id;
	private String nome;
	private String preco;

	/**
	 * Construtor
	 */
	public ModelProduto() {

	}

	/**
	 * seta o valor de id
	 * 
	 * @param Id
	 */
	public void setId(int Id) {
		this.id = Id;
	}

	/**
	 * return pk_id
	 */
	public int getId() {
		return this.id;
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
	 * seta o valor de preco
	 * 
	 * @param Preco
	 */
	public void setPreco(String Preco) {
		this.preco = Preco;
	}

	/**
	 * return preco
	 */
	public String getPreco() {
		return this.preco;
	}

	@Override
	public String toString() {
		return "ModelProduto {" + "::id = " + this.id + "::nome = " + this.nome + "::preco = " + this.preco + "}";
	}
}