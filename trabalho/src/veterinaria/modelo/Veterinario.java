package veterinaria.modelo;

import java.time.LocalDate;
import java.util.HashSet;

public final class Veterinario extends Proprietario {

	private final int CRMV;
	private final HashSet<Especialidade> especialidades = new HashSet<>();

	public Veterinario(String nome, String CPF, int CRMV) {
		super(nome, CPF);
		this.CRMV = CRMV;
	}

	public void addEspecialidade(Especialidade e) {
		especialidades.add(e);
	}

	public HashSet<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public int getCRMV() {
		return CRMV;
	}

	public LocalDate getConsultas() {
		// TODO Auto-generated method stub
		return null;
	}

}
