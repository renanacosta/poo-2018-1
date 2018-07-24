package Matrix;

public class Agent extends Person {

	public Agent(String LastName) {
		super(LastName);
	}

	@Override
	public String getFirstName() {
		return this.FirstName;
	}

	@Override
	public String getMiddleName() {
		return this.MiddleName;
	}

	@Override
	public String getLastName() {
		return this.LastName;
	}

	@Override
	String getFullName() {
		return null;
	}

	@Override
	String getAlias() {
		return null;
	}
	
	@Override
	public String toString() {
		return "Agent " + this.getLastName();
	}

	@Override
	boolean isCaptainOf(Ship s) {
		return false;
	}

	@Override
	void setCaptain(boolean b) {
		return;
	}
}
