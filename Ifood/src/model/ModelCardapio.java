package model;

/**
 *
 * @author Renan Acosta
 */
public class ModelCardapio {

	private String TiposDeProduto;

	/**
	 * Construtor
	 */
	public ModelCardapio() {
	}

	/**
	 * seta o valor de TiposDeProduto
	 * 
	 * @param TiposDeProduto
	 */
	public void setTiposDeProduto(String TiposDeProduto) {
		this.TiposDeProduto = TiposDeProduto;
	}

	/**
	 * return pk_TiposDeProduto
	 */
	public String getTiposDeProduto() {
		return this.TiposDeProduto;
	}

	@Override
	public String toString() {
		return "ModelCardapio {" + "::TiposDeProduto = " + this.TiposDeProduto + "}";
	}
}