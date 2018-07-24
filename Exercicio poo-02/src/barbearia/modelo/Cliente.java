package barbearia.modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Cliente extends Pessoa {

	
	private final Genero genero;
	private final LocalDate dataNascimento;
	private final ArrayList<Atendimento> atendimentos =
			new ArrayList<>();
	
	public Cliente(String nome, String CPF,
			Genero genero,
			LocalDate dataNascimento) {
		super(nome, CPF);
		
		this.genero = genero;
		this.dataNascimento = dataNascimento;
	}

	public ArrayList<Atendimento> getAtendimentos() {
		return atendimentos;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public int getIdade() {
		return Period.between(dataNascimento, 
				LocalDate.now()).getYears();
	}

	@Override
	public boolean equals(Object o) {
		if ( ! (o instanceof Cliente)) return false;
		Cliente c = (Cliente) o;
		return this.getCPF().equals(c.getCPF());
	}

	@Override
		
		public String toString() {
			return "Cliente [Nome: " + getNome() + ", CPF: " + getCPF() + 
					", Data de Nascimento: " + dataNascimento + ", Gênero: " + genero + 
					"]";
		
		
	}

	void addAtendimento(Atendimento a) {
		this.atendimentos.add(a);
	}
	
		
}
