package barbearia.modelo;

public class Cancelamento {

	private final String motivo;
	private final String responsavel;
	
	public Cancelamento(String motivo, String responsavel) {
		this.motivo = motivo;
		this.responsavel = responsavel;
	}

	public String getMotivo() {
		return motivo;
	}

	public String getResponsavel() {
		return responsavel;
	}
	
	
}
