package clinica.modelo;

public class Prontuario {

	private final String diagnostico;
	private final String prescricao;
	
	public Prontuario(String diagnostico, String prescricao) {
		this.diagnostico = diagnostico;
		this.prescricao = prescricao;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public String getPrescricao() {
		return prescricao;
	}

	@Override
	public String toString() {
		return "Prontuario [diagnostico=" + diagnostico + ", prescricao=" + prescricao + "]";
	}
	
	
	
}
