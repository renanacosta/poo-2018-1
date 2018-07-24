package clinica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import clinica.modelo.Clinica;
import clinica.modelo.Consulta;
import clinica.modelo.Genero;
import clinica.modelo.Veterinario;
import clinica.modelo.Paciente;
import clinica.modelo.PacienteJaTemConsultaAgendadaException;
import clinica.modelo.PacienteNaoEncontradoException;
import clinica.modelo.TipoSanguineo;

public class Main {
	public static void main(String[] args) {
		TipoSanguineo t = TipoSanguineo.AB_Negativo;
		System.out.println(t);
		System.out.println(t.name());
		System.out.println(t.ordinal());
		// Caminho Feliz!
		Veterinario regis = new Veterinario("Régis Guimarães", 
				"88877722233", 11456);
		
		Paciente yuri = new Paciente("Yuri Maciel", 
				"99977722233", TipoSanguineo.A_Positivo, 
				Genero.Masculino, LocalDate.of(1996, 3, 23));
		
		Clinica matheusClinica = 
				new Clinica("MClínica", 
						"222333444999922", 
						"Matheus e Cia.");
		
		matheusClinica.cadastrarPaciente(yuri);
		matheusClinica.cadastrarMedico(regis);
		
		System.out.println(
			matheusClinica.buscarPaciente("99977722233"));
		
		System.out.println(
			matheusClinica.buscarMedico(11456));
		
		Consulta con = matheusClinica
				.agendarConsulta(11456, "99977722233", 
				LocalDateTime.of(2018, 5, 16, 15, 0));
		
		System.out.println(con);
		System.out.println(con.getSituacao()); // Agendada
		
		con.realizar("Virose", "Tomar água e dormir bem");
		
		System.out.println(con.getSituacao()); // Realizada
		
		// Caminhos Excepcionais
		
		try {
			matheusClinica.buscarPaciente("66288399393");
		} catch (PacienteNaoEncontradoException ex) {
			System.out.println("Exceção esperada: " + ex);
		} catch (Exception ex) {
			System.out.println("Exceção NÃO esperada: " + ex);
		}
		
		
		matheusClinica
			.agendarConsulta(11456, "99977722233", 
				LocalDateTime.of(2018, 5, 20, 15, 0));
		try {
			matheusClinica
				.agendarConsulta(11456, "99977722233", 
					LocalDateTime.of(2018, 5, 22, 15, 0));
		} catch (PacienteJaTemConsultaAgendadaException ex) {
			System.out.println("Exceção esperada: " + ex);
		} catch (Exception ex) {
			System.out.println("Exceção NÃO esperada: " + ex);
		}
		
		
		Paciente p1 = matheusClinica.buscarPaciente("99977722233");
		System.out.println(p1.getConsultas().size()); // 2!
		// Como eu encontro as consultas do Yuri?!
		
		ArrayList<Consulta> consultasDoYuri =
				p1.getConsultas();
		for (Consulta c : consultasDoYuri) {
			System.out.println("Prontuário: " 
				+ c.getProntuario());
		}
		
		System.out.println(
		  matheusClinica.buscarPaciente("99977722233")
		  .getConsultas().get(0).getMedico().getCRM()
		);
		
		Veterinario m = matheusClinica.buscarMedico(11456)
			.getConsultas().get(0).getPaciente()
			.getConsultas().get(0).getMedico();
		
		System.out.println(m);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
