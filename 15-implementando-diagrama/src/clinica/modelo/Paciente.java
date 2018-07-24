package clinica.modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Paciente extends Pessoa {

	private final TipoSanguineo tipoSanguineo;
	private final Genero genero;
	private final LocalDate dataNascimento;
	private final ArrayList<Consulta> consultas =
			new ArrayList<>();
	
	public Paciente(String nome, String CPF,
			TipoSanguineo tipoSanguineo, Genero genero,
			LocalDate dataNascimento) {
		super(nome, CPF);
		this.tipoSanguineo = tipoSanguineo;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
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
		if ( ! (o instanceof Paciente)) return false;
		Paciente p = (Paciente) o;
		return this.getCPF().equals(p.getCPF());
	}

	@Override
	public String toString() {
		return "Paciente [dataNascimento=" + dataNascimento + ", genero=" + genero + ", tipoSanguineo=" + tipoSanguineo
				+ ", getCPF()=" + getCPF() + ", getNome()=" + getNome() + "]";
	}

	void addConsulta(Consulta c) {
		this.consultas.add(c);
	}
	
	
	
	
	
	
}
