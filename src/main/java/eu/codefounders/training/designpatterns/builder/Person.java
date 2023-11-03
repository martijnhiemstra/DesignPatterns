package eu.codefounders.training.designpatterns.builder;

public class Person {

	private String name;

	private int age;

	private boolean active;

	public String getName() {
		return name;
	}

	public Person withName(String name) {
		this.name = name;
		return this;
	}

// 	Een setter mag echter hoort niet bij de builder pattern
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public Person withAge(int age) {
		this.age = age;
		return this;
	}

	public Person withActive(boolean active) {
		this.active = active;
		return this;
	}

	@Override
	public String toString() {
		return "MyBuilder: Name: " + this.name + " - Age: " + this.age + " - Active: " + this.active;
	}

}
