package Matrix;

public class Matrix {

	private Person[] person = new Person[0];
	
	public Person newHuman(String LastName, String FirstName) {
		Person h = new Human(LastName, FirstName);
		h.setPlugged(true);
		add(h);
		return h;
	}
	
	public Person newHuman(String LastName, String MiddleName, String FirstName) {
		Person h = new Human(LastName, MiddleName, FirstName);
		h.setPlugged(true);
		add(h);
		return h;
	}
	
	public Person newHuman(String alias) {
		Person h = new Human(alias);
		h.setPlugged(true);
		add(h);
		return h;
	}
	
	public Person newAgent(String LastName) {
		Person a = new Agent(LastName);
		a.setPlugged(true);
		add(a);
		return a;
	}
	
	public Person newProgram(String alias) {
		Person p = new Program(alias);
		p.setPlugged(true);
		add(p);
		return p;
	}
	
	public boolean has(Person pessoa) {
		for(Person p : person) if(p.equals(pessoa)) return true;
		return false;
	}
	
	public void enter(Person p) {
		if(p.isPlugged() || !p.isAlive()) return;
		p.setPlugged(true);
		add(p);
	}
	
	public void enter(Person p1, Person p2) {
		enter(p1);
		enter(p2);
	}
	
	public void free(Person p, String alias) {
		if(!(p instanceof Human)) return;
		remove(p);
		p.setPlugged(false);
		p.setFirstName(null);
		p.setMiddleName(null);
		p.setLastName(alias);
		
	}
	
	public void leave(Person p) {
		if(!has(p)) return;
		p.setPlugged(false);
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
