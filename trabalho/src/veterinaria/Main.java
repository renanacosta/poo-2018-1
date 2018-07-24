package veterinaria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import veterinaria.modelo.Animais;
import veterinaria.modelo.Clinica_veterinaria;
import veterinaria.modelo.Consulta;
import veterinaria.modelo.Pet;
import veterinaria.modelo.PetJaTemConsultaAgendadoException;
import veterinaria.modelo.PetNaoEncontradoException;
import veterinaria.modelo.Veterinario;

public class Main {
	public static void main(String[] args) {
		Veterinario regis = new Veterinario("Régis Guimarães", "88877722233", 11456);

		Pet yuri = new Pet("Yuri Maciel", "99977722233", Animais.Domesticos,
				LocalDate.of(1996, 3, 23));

		Clinica_veterinaria matheusClinica = new Clinica_veterinaria("MClínica", "222333444999922", "Matheus e Cia.");

		matheusClinica.cadastrarPet(yuri);
		matheusClinica.cadastrarVeterinario(regis);

		System.out.println(matheusClinica.buscarPet("99977722233"));

		System.out.println(matheusClinica.buscarVeterinario(11456));

		Consulta con = matheusClinica.agendarConsulta(11456, "99977722233", LocalDateTime.of(2018, 5, 16, 15, 0));

		System.out.println(con);
		System.out.println(con.getSituacao()); // Agendada

		con.realizar("Virose", "Tomar água e dormir bem");

		System.out.println(con.getSituacao()); // Realizada

		// Caminhos Excepcionais

		try {
			matheusClinica.buscarPet("66288399393");
		} catch (PetNaoEncontradoException ex) {
			System.out.println("Exceção esperada: " + ex);
		} catch (Exception ex) {
			System.out.println("Exceção NÃO esperada: " + ex);
		}

		matheusClinica.agendarConsulta(11456, "99977722233", LocalDateTime.of(2018, 5, 20, 15, 0));
		try {
			matheusClinica.agendarConsulta(11456, "99977722233", LocalDateTime.of(2018, 5, 22, 15, 0));
		} catch (PetJaTemConsultaAgendadoException ex) {
			System.out.println("Exceção esperada: " + ex);
		} catch (Exception ex) {
			System.out.println("Exceção NÃO esperada: " + ex);
		}

		Pet p1 = matheusClinica.buscarPet("99977722233");
		System.out.println(p1.getConsultas().size()); // 2!
		// Como eu encontro as consultas do Yuri?!

		ArrayList<Consulta> consultasDoYuri = p1.getConsultas();
		for (Consulta c : consultasDoYuri) {
			System.out.println("Prontuário: " + c.getProntuario());
		}

		System.out.println(
				  matheusClinica.buscarPet("99977722233")
				  .getConsultas().get(0).getVeterinario().getCRMV()
				);
				
	}

}