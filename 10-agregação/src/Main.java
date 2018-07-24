
public class Main {

	public static void main(String[] args) {

	/*	Cliente cli1 = new Cliente("Marcio");
		System.out.println(cli1);
		System.out.println(cli1.getNome());
		cli1.setTelefone("88776655");
		System.out.println(cli1.getTelefone());
		cli1.setTelefoneCelular("9988776655");
		System.out.println(cli1.getTelefoneCelular());
		*/
		Cliente cli1 = new Cliente("Marcio");
		System.out.println(cli1);
		System.out.println(cli1.getNome());
		//cli1.addTelefone("88776655");
		//System.out.println(cli1.getTelefone());
		//cli1.addTelefoneCelular("9988776655");
		//System.out.println(cli1.getTelefoneCelular());
	Telefone t1 = new TelefoneCelular("53", "99883344"); // Celular
	Telefone t2 = new TelefoneResidencial("32349993"); // Residencial
	
	cli1.addTelefone(t1);
	cli1.addTelefone(t2);
	
	Telefone[] tels = cli1.getTelefones();
	for (Telefone t : tels) { // for each
		System.out.println(t);
		
	}
		cli1.removeTelefone(t1);
		System.out.println("Telefone Restantes:");
		for (Telefone t : cli1.getTelefones()) {
			System.out.println(t);
		}
	
	
	//System.out.println(t1);
	//System.out.println(t2);
	
	// CO-VARIÂNCIA
	TelefoneCelular tc = new TelefoneCelular("99883334");
	TelefoneResidencial tr = new TelefoneResidencial("2323232");
	//TelefoneResidencial é co-variante de Telefone
	Telefone tc2 = new TelefoneResidencial("23232344");
	
	}
}
