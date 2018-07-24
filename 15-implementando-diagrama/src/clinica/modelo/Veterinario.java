package clinica.modelo;

import java.util.ArrayList;
import java.util.HashSet;

// final: esta classe não poderá ser estendida
public final class Veterinario extends Pessoa {

	private final int CRM;
	private final HashSet<Especialidade> especialidades = 
			new HashSet<>();
	
	private ArrayList<Consulta> consultas =
			new ArrayList<>();
	
	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}
	
	void addConsulta(Consulta c) {
		this.consultas.add(c);
	}
	
	public Veterinario(String nome, String CPF, int CRM) {
		super(nome, CPF);
		this.CRM = CRM;
	}
	
	public void addEspecialidade(Especialidade e) {
		especialidades.add(e);
	}
	
	public HashSet<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public int getCRM() {
		return CRM;
	}

	@Override
	public String toString() {
		return "Medico [CRM=" + CRM + ", especialidades=" + especialidades + ", getNome()=" + getNome() + ", getCPF()="
				+ getCPF() + "]";
	}

	
	
}
