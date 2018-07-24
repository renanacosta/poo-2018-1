package veterinaria.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Clinica_veterinaria {

	private final String nome;
	private final String CNPJ;
	private final String razaoSocial;
	
	private final ArrayList<Veterinario> Veterinarios =
			new ArrayList<>();
	private final ArrayList<Pet> Pets =
			new ArrayList<>();
	private final ArrayList<Consulta> consultas =
			new ArrayList<>();
	
	public Clinica_veterinaria(String nome, String CNPJ, 
			       String razaoSocial) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.razaoSocial = razaoSocial;
	}
	
	public void cadastrarPet(Pet p) {
		Pets.add(p);
	}
	
	public void cadastrarVeterinario(Veterinario m) {
		Veterinarios.add(m);
	}
	
	public Pet buscarPet(String CPF) {
		for (Pet p : Pets) {
			if (p.getCPF().equals(CPF)) {
				return p;
			}
		}
		throw new PetNaoEncontradoException();
	}
	
	public Veterinario buscarVeterinario(int CRMV) {
		for (Veterinario m : Veterinarios) 
			if (m.getCRMV() == CRMV) return m;
		
		throw new VeterinarioNaoEncontradoException();
	}
	
	public Consulta agendarConsulta(int CRMV, String CPF,
			LocalDateTime dataHora) {
		Veterinario   m = buscarVeterinario(CRMV);
		Pet p = buscarPet(CPF);
		Consulta c = new Consulta(m, p, dataHora);
		consultas.add(c);
		return c;
	}

	public String getNome() {
		return nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	
	
	
}

