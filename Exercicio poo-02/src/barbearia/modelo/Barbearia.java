package barbearia.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Barbearia { // ANTI-PATTERN: GOD CLASS

	private final String nome;
	private final String CNPJ;
	private final String razaoSocial;
	
	private final ArrayList<Barbeiro> barbeiros =
			new ArrayList<>();
	private final ArrayList<Cliente> clientes =
			new ArrayList<>();
	private final ArrayList<Atendimento> atendimentos =
			new ArrayList<>();
	
	public Barbearia(String nome, String CNPJ, 
			       String razaoSocial) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.razaoSocial = razaoSocial;
	}
	
	public void cadastrarCliente(Cliente cli) {
		clientes.add(cli);
	}
	
	public void cadastrarBarbeiro(Barbeiro barb) {
		barbeiros.add(barb);
	}
	
	public Cliente buscarCliente(String CPF) {
		for (Cliente cli : clientes) {
			if (cli.getCPF().equals(CPF)) {
				return cli;
			}
		}
		throw new ClienteNaoEncontradoException();
	}
	
	public Barbeiro buscarBarbeiro(int CRB) {
		for (Barbeiro barb : barbeiros) 
			if (barb.getCRB() == CRB) return barb;
		
		throw new BarbeiroNaoEncontradoException();
	}
	
	public Atendimento agendarAtendimento(int CRB, String CPF,
			LocalDateTime dataHora) {
		
		Barbeiro barb = buscarBarbeiro(CRB);
		
		Cliente cli = buscarCliente(CPF);
		for (Atendimento atendimento : atendimentos) {
			if (atendimento.getSituacao().equals(Situacao.Agendada)) {
				if (cli.equals(atendimento.getCliente())) {
					throw new ClienteJaTemAtendimentoAgendadoException();
				}
			}
		}
		
		Barbeiro b = buscarBarbeiro(CRB);
		Atendimento atendimento = new Atendimento(b, cli, dataHora);
		atendimentos.add(atendimento);
		return atendimento;
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

	public ArrayList<Atendimento> buscarAtendimento(String CPF) {
		Cliente cli = buscarCliente(CPF);
		ArrayList<Atendimento> atendimentoCliente =
				new ArrayList<>();
		for (Atendimento atendimento : atendimentos) {
			if (atendimento.getCliente().equals(cli)) {
				atendimentoCliente.add(atendimento);
			}
		}
		return atendimentoCliente;
	}

		
}
