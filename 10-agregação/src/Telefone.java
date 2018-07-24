// classes abstratas são obrigadas a serem estendidas
// não é possivel dar "new" numa classe abstrata
public abstract class Telefone {
	
	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {

		super();
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public Telefone(String numero) {
		this(null, numero);
	}
	
	public abstract String getTipo();
	
	@Override
	public String toString() {
		return getTipo() + "(" + ddd + ")" + numero;
	}
	
}
