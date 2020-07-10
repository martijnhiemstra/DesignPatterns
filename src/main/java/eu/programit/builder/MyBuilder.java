package eu.programit.builder;

public class MyBuilder {

	private String name;

	private int value;

	public MyBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public MyBuilder withValue(int value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return "MyBuilder: Name: " + this.name + " - Value: " + this.value;
	}
	
	public static MyBuilder create() {
		return new MyBuilder();
	}

}
