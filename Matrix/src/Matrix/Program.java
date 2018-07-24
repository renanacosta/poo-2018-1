package Matrix;

public class Program extends Person{

	public Program(String LastName) {
		super(LastName);
	}
	
	@Override
	public String getFirstName() {
		return null;
	}
	
	@Override
	public String getMiddleName() {
		return null;
	}
	
	@Override
	public String getLastName() {
		return null;
	}

	@Override
	String getFullName() {
		return null;
	}

	@Override
	String getAlias() {
		return this.LastName;
	}
	
	@Override
	public String toString() {
		return "The " + this.getAlias();
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
