package Matrix;

public class Ship {

	private String nome;
	private Person[] person = new Person[0];
	private Person capitain;
	
	public Ship(String nome) {
		this.nome = nome;
	}
	
	public int crewCount() {
		return this.person.length;
	}
	
	public Person getCaptain() {
		if(this.capitain == null && this.person.length > 0) this.capitain = this.person[0];
		return this.capitain;
	}

	public void recruit(Person p) {
		if(p.isRecruted()) return; 
		p.setRecruted(true);
		add(p);
	}
	
	public void setCaptain(Person p) {
		if(!has(p)) return; 
		this.capitain.setCaptain(false);
		this.capitain = p;
		p.setCaptain(true);
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
	public boolean has(Person pessoa) {
		for(Person p : person) if(p.equals(pessoa)) return true;
		return false;
	}

	public void removeCrew(Person p) {
		if(!has(p)) return; 
		p.setRecruted(false);
		remove(p);
	}
	
	public void destroy() {
		for(Person p : person)
			p.kill(p);
	}
	
	// Privates
	
	private void add(Person p) {
		Person temp[] = this.person;
		this.person = new Person[this.person.length + 1];
		this.person[this.person.length-1] = p;			
		for(int i = 0; i < this.person.length-1; i++) 
		this.person[i] = temp[i];
	}
	
	private void remove(Person p) {
		for(int i = 0; i < this.person.length ; i++) {
			if (this.person[i].equals(p)) {				
				deletar(i);	
				return;
			}
		}
	}
	
	private void deletar(int index) {
		Person temp[] = this.person;
		this.person = new Person[this.person.length - 1];
		for(int i = 0; i < index; i++) 
			this.person[i] = temp[i];
		for(int i = index; i < temp.length - 1; i++)
			this.person[i] = temp[i+1];
	}
}
