package barbearia;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import barbearia.modelo.Atendimento;
import barbearia.modelo.Barbearia;
import barbearia.modelo.Barbeiro;
import barbearia.modelo.Cliente;
import barbearia.modelo.ClienteJaTemAtendimentoAgendadoException;
import barbearia.modelo.ClienteNaoEncontradoException;
import barbearia.modelo.Especialidade;
import barbearia.modelo.Genero;

public class Main {
	public static void main(String[] args) {
		
		// Caminho Feliz!
		
		System.out.println("===============================");
		System.out.println("       BARBEARIA DARKSIDE      ");
		System.out.println("===============================");
		
		System.out.println();
		
		
		
		// barbeiros
		
		Barbeiro Luke = new Barbeiro("Luke Skywalker",
				"88877722233", 11456, Especialidade.Bigode);
		Luke.addEspecialidade(Especialidade.Barba);
		
		Barbeiro HanSolo = new Barbeiro("Han Solo",
				"66699911133", 11987, Especialidade.Cabelo);
		HanSolo.addEspecialidade(Especialidade.Barba);
		
		Barbeiro Chewbacca = new Barbeiro("Chewbacca",
				"55500044477", 12345, Especialidade.Barba);
		Chewbacca.addEspecialidade(Especialidade.Cabelo);
		
		Barbeiro MestreYoda = new Barbeiro("Mestre Yoda",
				"44400044488", 12666, Especialidade.Bigode);
		
		Barbeiro R2D2 = new Barbeiro("R2-D2",
				"23125423311", 13254, Especialidade.Cabelo);
		R2D2.addEspecialidade(Especialidade.Barba);
		R2D2.addEspecialidade(Especialidade.Bigode);
		
		// clientes
		
		Cliente Kenobi = new Cliente("Obi-Wan Kenobi", 
				"99977722233", Genero.Masculino, LocalDate.of(1965, 3, 23));
		
		Cliente DarthMaul = new Cliente("Darth Maul", 
				"09865433311", Genero.Masculino, LocalDate.of(1970, 8, 12));
		
		Cliente PrincesaLeia = new Cliente("Princesa Leia", 
				"11177776598", Genero.Feminino, LocalDate.of(1979, 12, 8));
		
		Cliente Lando = new Cliente("Lando", 
				"66688844444", Genero.Masculino, LocalDate.of(1967, 5, 11));
		
		Barbearia DarkSideBarbearia = 
				new Barbearia("DSBarberShop", 
						"222333444999922", 
						"Star Wars e Cia.");
		
		// barbeiros cadastrados
		
		DarkSideBarbearia.cadastrarBarbeiro(Luke);
		DarkSideBarbearia.cadastrarBarbeiro(HanSolo);
		DarkSideBarbearia.cadastrarBarbeiro(Chewbacca);
		DarkSideBarbearia.cadastrarBarbeiro(MestreYoda);
		DarkSideBarbearia.cadastrarBarbeiro(R2D2);
		
		// clientes cadastrados
		
		DarkSideBarbearia.cadastrarCliente(Kenobi);
		DarkSideBarbearia.cadastrarCliente(DarthMaul);
		DarkSideBarbearia.cadastrarCliente(PrincesaLeia);
		DarkSideBarbearia.cadastrarCliente(Lando);
		
		System.out.println();
		System.out.println("### TESTES PARA CLIENTES ###");
		System.out.println();
		
		
		System.out.println(
			DarkSideBarbearia.buscarCliente("99977722233"));
		System.out.println(
				DarkSideBarbearia.buscarCliente("99977722233").equals(Kenobi));
		
		System.out.println(
				DarkSideBarbearia.buscarCliente("09865433311"));
			System.out.println(
					DarkSideBarbearia.buscarCliente("09865433311").equals(DarthMaul));
			
			System.out.println(
					DarkSideBarbearia.buscarCliente("11177776598"));
				System.out.println(
						DarkSideBarbearia.buscarCliente("11177776598").equals(PrincesaLeia));
				
				System.out.println(
						DarkSideBarbearia.buscarCliente("66688844444"));
					System.out.println(
							DarkSideBarbearia.buscarCliente("66688844444").equals(Lando));
					
					
		System.out.println();
		System.out.println("### TESTES PARA BARBEIROS ###");
		System.out.println();
		
		
		System.out.println(
			DarkSideBarbearia.buscarBarbeiro(11456));
		System.out.println(
				DarkSideBarbearia.buscarBarbeiro(11456).equals(Luke));
		
		System.out.println(
				DarkSideBarbearia.buscarBarbeiro(11987));
			System.out.println(
					DarkSideBarbearia.buscarBarbeiro(11987).equals(HanSolo));
			
			System.out.println(
					DarkSideBarbearia.buscarBarbeiro(12345));
				System.out.println(
						DarkSideBarbearia.buscarBarbeiro(12345).equals(Chewbacca));
				
				System.out.println(
						DarkSideBarbearia.buscarBarbeiro(12666));
					System.out.println(
							DarkSideBarbearia.buscarBarbeiro(12666).equals(MestreYoda));
					
					System.out.println(
							DarkSideBarbearia.buscarBarbeiro(13254));
						System.out.println(
								DarkSideBarbearia.buscarBarbeiro(13254).equals(R2D2));
		
		
		
		
		//=========================================================================================
		
		Atendimento con = DarkSideBarbearia
				.agendarAtendimento(11456, "99977722233", 
				LocalDateTime.of(2018, 5, 16, 15, 0));
		
		System.out.println(con);
		System.out.println(con.getSituacao()); // Agendada
		
		con.realizar("Aparar abarba");
		
		System.out.println(con.getSituacao()); // Realizada
		
		
		// teste 2
		
		System.out.println(
				DarkSideBarbearia.buscarCliente("09865433311"));
			
			System.out.println(
				DarkSideBarbearia.buscarBarbeiro(11987));
			
			Atendimento con1 = DarkSideBarbearia
					.agendarAtendimento(11987, "09865433311", 
					LocalDateTime.of(2018, 6, 16, 15, 10));
			
			System.out.println(con1);
			System.out.println(con1.getSituacao()); // Agendada
			
			con1.realizar("Cortar cabelo");
			
			System.out.println(con1.getSituacao()); // Realizada
		
		// Caminhos Excepcionais
		
		try {
			DarkSideBarbearia.buscarCliente("66288399393");
		} catch (ClienteNaoEncontradoException ex) {
			System.out.println("Exceção esperada: " + ex);
		} catch (Exception ex) {
			System.out.println("Exceção NÃO esperada: " + ex);
		}
		
		
		DarkSideBarbearia
			.agendarAtendimento(11456, "99977722233", 
				LocalDateTime.of(2018, 5, 20, 15, 0));
		try {
			DarkSideBarbearia
				.agendarAtendimento(11456, "99977722233", 
					LocalDateTime.of(2018, 5, 22, 15, 0));
		} catch (ClienteJaTemAtendimentoAgendadoException ex) {
			System.out.println("Exceção esperada: " + ex);
		} catch (Exception ex) {
			System.out.println("Exceção NÃO esperada: " + ex);
		}
		
		
		Cliente c1 = DarkSideBarbearia.buscarCliente("99977722233");
		System.out.println(c1.getAtendimentos().size()); // 2!
		// Como eu encontro os atendimentos do Kenobi?!
		
		ArrayList<Atendimento> atendimentosDoKenobi =
				c1.getAtendimentos();
		for (Atendimento a : atendimentosDoKenobi) {
			System.out.println("Procedimento Realizado: " 
				+ a.getProcedimento());
		}
		
		System.out.println(
		  DarkSideBarbearia.buscarCliente("99977722233")
		  .getAtendimentos().get(0).getBarbeiro().getCRB()
		);
		
		Barbeiro b = DarkSideBarbearia.buscarBarbeiro(11456)
			.getAtendimentos().get(0).getCliente()
			.getAtendimentos().get(0).getBarbeiro();
		
		System.out.println(b);
		

		
				
	}
}
