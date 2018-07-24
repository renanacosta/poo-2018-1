package model;

/**
 *
 * @author Renan Acosta
 */
public class ModelUsuario {

	private int id;
	private String nome;
	private String email;

	/**
	 * Construtor
	 */
	public ModelUsuario() {
	}

	/**
	 * seta o valor de int
	 * 
	 * @param Id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * return id_pk
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
	 * seta o valor de email
	 * 
	 * @param Email
	 */
	public void setEmail(String Email) {
		this.email = Email;
	}

	/**
	 * return email
	 */
	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return "ModelUsuario {" + "::int = " + this.id + "::nome = " + this.nome + "::email = " + this.email + "}";
	}

	public char[] isTransient() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] isPersistent() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void save(ModelUsuario usuario1) {
		// TODO Auto-generated method stub

	}

}