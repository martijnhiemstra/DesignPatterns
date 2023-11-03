package eu.codefounders.training.designpatterns.encapsulation;

/**
 * All fields are private and therefore can not be accessed directly
 */
public class Person {

	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private boolean admin;
	
	public String getFirstName() {
		return firstName;
	}

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
