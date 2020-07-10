package eu.programit.encapsulation;

/**
 * All fields are private and therefore can not be accessed directly
 */
public class Person {

	private String firstName;
	
	private String lastName;
	
	private int age;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
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
	
}
