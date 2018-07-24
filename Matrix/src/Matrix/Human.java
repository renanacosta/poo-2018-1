package Matrix;

public class Human extends Person{

	private boolean captain;
	
	public Human(String LastName, String MiddleName, String FirstName) {
		super(LastName, MiddleName, FirstName);
	}
	
	public Human(String LastName, String FirstName) {
		super(FirstName, LastName);
	}
	
	public Human(String LastName) {
		super(LastName);
	}
	
	@Override
	public String getFirstName() {
		if(getAlias() != null) return null;
		return this.FirstName;
	}

	@Override
	public String getMiddleName() {
		if(getAlias() != null) return null;
		return this.MiddleName;
	}

	@Override
	public String getLastName() {
		if(getAlias() != null) return null;
		return this.LastName;
	}
	
	public boolean isCaptainOf(Ship s) {
		return this.captain;
	}

	public void setCaptain(boolean c) {
		this.captain = c;
	}
	
	@Override
	String getFullName() {
		if(getAlias() == null) 
		return (this.FirstName != null ? this.FirstName : "") + 
			   (this.MiddleName != null ? " " + this.MiddleName : "") + 
			   (this.LastName != null ? " " + this.LastName : "");
		
		return null;
	}

	@Override
	String getAlias() {
		if((FirstName == null && LastName != null) && (MiddleName == null && LastName != null)) {
			return this.LastName; 
		}
		return null;
	}
	
	@Override
	public String toString() {
		if(getAlias() == null)return "Mr. " + this.getLastName();
		return getAlias();
	}
	
}
