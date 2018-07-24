package barbearia.modelo;

import java.util.ArrayList;
import java.util.HashSet;

// final: esta classe não poderá ser estendida
public final class Barbeiro extends Pessoa {

private final int CRB;
private final HashSet<Especialidade> especialidades = 
		new HashSet<>();

private ArrayList<Atendimento> atendimentos =
		new ArrayList<>();

public ArrayList<Atendimento> getAtendimentos() {
	return atendimentos;
}

void addAtendimento(Atendimento a) {
	this.atendimentos.add(a);
}

public Barbeiro(String nome, String CPF, int CRB, Especialidade e) {
	super(nome, CPF);
	this.CRB = CRB;
	especialidades.add(e);
}

public void addEspecialidade(Especialidade e) {
	especialidades.add(e);
}

public HashSet<Especialidade> getEspecialidades() {
	return especialidades;
}

public int getCRB() {
	return CRB;
}

@Override
	
	public String toString() {
		return "Barbeiro [Nome: " + getNome() + ", CPF: " + getCPF() + ", CRB: " + CRB +
				", Especialidade: " + especialidades + "]";
	
	}

	
}