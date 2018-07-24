package Matrix;

public abstract class Person {

	protected String FirstName;
	protected String MiddleName;
	protected String LastName;
	private boolean plugged;
	private boolean recruted;
	private boolean alive = true;
	

	public Person(String LastName) {
		this.LastName = LastName;
	}
	
	public Person(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	public Person(String LastName, String MiddleName, String FirstName) {
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
	}
	
	public String getFirstName() {
		return this.FirstName;
	}

	public String getMiddleName() {
		return this.MiddleName;
	}

	public String getLastName() {
		return this.LastName;
	}
	
	abstract String getFullName();
	
	abstract String getAlias();
	
	public boolean isPlugged() {
		return plugged;
	}
	
	public void setPlugged(boolean b) {
		this.plugged = b;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	abstract boolean isCaptainOf(Ship s);

	abstract void setCaptain(boolean b);

	public void becameCaptainOf(Ship ship) {
		ship.setCaptain(this);
		
	}

	public boolean isCrewOf(Ship ship) {
		if(ship.has(this)) return true;
		return false;
	}

	public boolean isRecruted() {
		return recruted;
	}

	public void setRecruted(boolean recruted) {
		this.recruted = recruted;
	}

	public void leaveShip(Ship ship) {
		if(!ship.has(this)) return;
		ship.removeCrew(this);
	}

	public void join(Ship ship) {
		if(this.isRecruted()) return;
		ship.recruit(this);
	}

	public void plug() {
		this.plugged = true;
	}

	public void unplug() {
		if(this instanceof Human)
		this.plugged = false;
	}

	public boolean isAlive() {
		return this.alive;
	}
	
	public void setAlive(boolean b) {
		this.alive = b;
	}

	public void unplug(Person p) {
		if(p instanceof Human) {
			if(!p.isPlugged()) return;
			p.setAlive(false);
			p.setPlugged(false);
		}
	}

	public void kill(Person p) {
		if(p instanceof Agent) {
			p.setPlugged(false);
			return;
		}
		if(!this.isAlive() || !p.isAlive()) return;
		if(this.isPlugged() && !p.isPlugged()) return;
		p.alive = false;
		p.setPlugged(false);
	}

	public void free(Person p, String alias) {
		p.setPlugged(false);
		p.setFirstName(null);
		p.setMiddleName(null);
		p.setLastName(alias);	
	}
	
}
