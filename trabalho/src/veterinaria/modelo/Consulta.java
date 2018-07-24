package veterinaria.modelo;

import java.time.LocalDateTime;

public class Consulta {

	private final Veterinario veterinario;
	private final Pet pet;
	private final LocalDateTime dataHora;
	
	private Situacao situacao;
	
	private Prontuario prontuario;
	private Cancelamento cancelamento;
	
	public Consulta(Veterinario m, Pet p, 
			LocalDateTime dataHora) {
		this.veterinario = m;
		this.pet = p;
		if (dataHora.isBefore(LocalDateTime.now())) {
			throw new DataHoraPassadaException();
		}
		this.dataHora = dataHora;
		this.situacao = Situacao.Agendada;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public Pet getPet() {
		return pet;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public Prontuario getProntuario() {
		return prontuario;
	}

	public Cancelamento getCancelamento() {
		return cancelamento;
	}

	public Prontuario realizar(String diagnostico, 
							   String prescricao) {
		
		if (this.situacao == Situacao.Cancelada
				|| this.situacao == Situacao.Suspensa) {
			throw new ConsultaFoiCanceladaException();
		}
		if (this.situacao == Situacao.Realizada) {
			throw new ConsultaJaFoiRealizadaException();
		}
		
		this.prontuario = 
				new Prontuario(diagnostico, prescricao);
		this.situacao = Situacao.Realizada;
		return this.prontuario;
	}
	
	public Cancelamento cancelar(String motivo, boolean veterinario) {
		
		if (this.situacao == Situacao.Realizada) {
			throw new ConsultaJaFoiRealizadaException();
		}
		
		if (this.situacao == Situacao.Cancelada ||
				this.situacao == Situacao.Suspensa) {
			throw new ConsultaFoiCanceladaException();
		}
		
		this.cancelamento = 
			new Cancelamento(motivo, veterinario ? "Médico" : "Pet");
		this.situacao = Situacao.Cancelada;
		return this.cancelamento;
	}
	
	public Cancelamento suspender(String motivo, boolean veterinario) {
		
		if (this.situacao == Situacao.Realizada) {
			throw new ConsultaJaFoiRealizadaException();
		}
		
		if (this.situacao == Situacao.Cancelada ||
				this.situacao == Situacao.Suspensa) {
			throw new ConsultaFoiCanceladaException();
		}
		
		this.cancelamento =
			new Cancelamento(motivo, veterinario ? "Médico" : "Pet");
		this.situacao = Situacao.Suspensa;
		return this.cancelamento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
