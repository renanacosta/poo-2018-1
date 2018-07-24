// é um tipo CONCRETO
public class TelefoneCelular extends Telefone {

	public TelefoneCelular(String ddd, String numero) {
		super(ddd, numero);
	}

	public TelefoneCelular(String numero) {
		super(numero);
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Celular";
	}

	

}
