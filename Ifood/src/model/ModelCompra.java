package model;

/**
 *
 * @author Renan Acosta
 */
public class ModelCompra {

	private int id;
	private String valor;

	/**
	 * Construtor
	 */
	public ModelCompra() {
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
	 * return id_pk
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * seta o valor de valor
	 * 
	 * @param Valor
	 */
	public void setValor(String Valor) {
		this.valor = Valor;
	}

	/**
	 * return valor
	 */
	public String getValor() {
		return this.valor;
	}

	@Override
	public String toString() {
		return "ModelCompra {" + "::id = " + this.id + "::valor = " + this.valor + "}";
	}
}