package veterinaria.modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class Pet extends Proprietario {

	
	private final Animais animais;
	private final LocalDate dataNascimento;
	
	public Pet(String nome, String NR,
			Animais animais,
			LocalDate dataNascimento) {
		super(nome, NR);
		this.animais = animais;
		this.dataNascimento = dataNascimento;
	}


	public Animais getAnimais() {
		return animais;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public int getIdade() {
		return Period.between(dataNascimento, 
				LocalDate.now()).getYears();
	}


	public ArrayList<Consulta> getConsultas() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
