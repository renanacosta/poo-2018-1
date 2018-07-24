package barbearia.modelo;

import java.time.LocalDateTime;


public class Atendimento {

	// relacionamento UNIDIRECIONAL com Barbeiro
		private final Barbeiro barbeiro;
		// relacionamento BIDIRECIONAL
		private final Cliente cliente;
		private final LocalDateTime dataHora;
		
		public Situacao situacao;
		
		public Procedimento procedimento;
		public Cancelamento cancelamento;
		
		public Atendimento(Barbeiro b, Cliente c, 
				LocalDateTime dataHora) {
			this.barbeiro = b;
			b.addAtendimento(this);
			this.cliente = c;
			c.addAtendimento(this); // bidirecionalidade!
			if (dataHora.isBefore(LocalDateTime.now())) {
				throw new DataHoraPassadaException();
			}
			this.dataHora = dataHora;
			this.situacao = Situacao.Agendada;
		}

		public Barbeiro getBarbeiro() {
			return barbeiro;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public LocalDateTime getDataHora() {
			return dataHora;
		}

		public Situacao getSituacao() {
			return situacao;
		}

		public Procedimento getProcedimento() {
			return procedimento;
		}

		public Cancelamento getCancelamento() {
			return cancelamento;
		}

		public Procedimento realizar(String descricao) {
			
			if (this.situacao == Situacao.Cancelada
					|| this.situacao == Situacao.Suspensa) {
				throw new AtendimentoFoiCanceladoException();
			}
			if (this.situacao == Situacao.Realizada) {
				throw new AtendimentoJaFoiRealizadoException();
			}
			
			this.procedimento = 
					new Procedimento(descricao);
			this.situacao = Situacao.Realizada;
			return this.procedimento;
		}
		
		public Cancelamento cancelar(String motivo, boolean barbeiro) {
			
			if (this.situacao == Situacao.Realizada) {
				throw new AtendimentoJaFoiRealizadoException();
			}
			
			if (this.situacao == Situacao.Cancelada ||
					this.situacao == Situacao.Suspensa) {
				throw new AtendimentoFoiCanceladoException();
			}
			
			this.cancelamento = 
				new Cancelamento(motivo, barbeiro ? "Barbeiro" : "Cliente");
			this.situacao = Situacao.Cancelada;
			return this.cancelamento;
		}
		
		public Cancelamento suspender(String motivo, boolean barbeiro) {
			
			if (this.situacao == Situacao.Realizada) {
				throw new AtendimentoJaFoiRealizadoException();
			}
			
			if (this.situacao == Situacao.Cancelada ||
					this.situacao == Situacao.Suspensa) {
				throw new AtendimentoFoiCanceladoException();
			}
			
			this.cancelamento =
				new Cancelamento(motivo, barbeiro ? "Barbeiro" : "Cliente");
			this.situacao = Situacao.Suspensa;
			return this.cancelamento;
		
	}
		
}
