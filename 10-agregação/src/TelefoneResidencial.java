
public class TelefoneResidencial extends Telefone {

	public TelefoneResidencial(String ddd, String numero) {
		super(ddd, numero);
		// TODO Auto-generated constructor stub
	}

	public TelefoneResidencial(String numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Residencial";
	}

}
