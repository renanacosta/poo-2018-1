package model;

/**
 *
 * @author Renan Acosta
 */
public class ModelEstabelecimento {

	private int id;
	private String nome;
	private String descricao;

	/**
	 * Construtor
	 */
	public ModelEstabelecimento() {
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
	 * seta o valor de descricao
	 * 
	 * @param Descricao
	 */
	public void setDescricao(String Descricao) {
		this.descricao = Descricao;
	}

	/**
	 * return descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public String toString() {
		return "ModelEstabelecimento {" + "::int = " + this.id + "::nome = " + this.nome + "::descricao = "
				+ this.descricao + "}";
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}