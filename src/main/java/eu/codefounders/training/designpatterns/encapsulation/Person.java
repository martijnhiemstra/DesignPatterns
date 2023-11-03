package eu.codefounders.training.designpatterns.encapsulation;

public class Person {

	// Alle properties zijn private en dus niet bereikbaar van buiten
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private boolean admin;
	
	/*
	 * Dit is een getter. Die haalt de waarde op van first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/*
	 * In een setter kunnen we een property instellen en doordat dit via een method gaat
	 * kunnen we controles/validatie doen om de interne waarde af te schermen 
	 */
	public void setFirstName(String firstName) {
		if (firstName != null)
			this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName != null)
			this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	// We kunnen in een setter ook een exception gooien
	public void setAge(int age) {
		if (age < 0)
			throw new IllegalArgumentException("Age must be larger than 0");

		this.age = age;
	}
	
	public boolean isAdmin() {
		return admin;
	}
	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
}
