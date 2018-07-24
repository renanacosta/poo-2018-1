package clinica.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Clinica { // ANTI-PATTERN: GOD CLASS

	private final String nome;
	private final String CNPJ;
	private final String razaoSocial;
	
	private final ArrayList<Veterinario> medicos =
			new ArrayList<>();
	private final ArrayList<Paciente> pacientes =
			new ArrayList<>();
	private final ArrayList<Consulta> consultas =
			new ArrayList<>();
	
	public Clinica(String nome, String CNPJ, 
			       String razaoSocial) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.razaoSocial = razaoSocial;
	}
	
	public void cadastrarPaciente(Paciente p) {
		pacientes.add(p);
	}
	
	public void cadastrarMedico(Veterinario m) {
		medicos.add(m);
	}
	
	public Paciente buscarPaciente(String CPF) {
		for (Paciente p : pacientes) {
			if (p.getCPF().equals(CPF)) {
				return p;
			}
		}
		throw new PacienteNaoEncontradoException();
	}
	
	public Veterinario buscarMedico(int CRM) {
		for (Veterinario m : medicos) 
			if (m.getCRM() == CRM) return m;
		
		throw new MedicoNaoEncontradoException();
	}
	
	public Consulta agendarConsulta(int CRM, String CPF,
			LocalDateTime dataHora) {
		
		Paciente p = buscarPaciente(CPF);
		for (Consulta consulta : consultas) {
			if (consulta.getSituacao().equals(Situacao.Agendada)) {
				if (p.equals(consulta.getPaciente())) {
					throw new PacienteJaTemConsultaAgendadaException();
				}
			}
		}
		
		Veterinario   m = buscarMedico(CRM);
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

	public ArrayList<Consulta> buscarConsultas(String CPF) {
		Paciente p = buscarPaciente(CPF);
		ArrayList<Consulta> consultasPaciente =
				new ArrayList<>();
		for (Consulta consulta : consultas) {
			if (consulta.getPaciente().equals(p)) {
				consultasPaciente.add(consulta);
			}
		}
		return consultasPaciente;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
