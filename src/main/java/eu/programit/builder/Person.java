package eu.programit.builder;

public class Person {

	private String name;
	
	private int age;
	
	public Person withName(String name) {
		this.name = name;
		return this;
	}

	public Person withAge(int age) {
		this.age = age;
		return this;
	}
	
	public Driver toDriver() {
		// 
	}
	
}
