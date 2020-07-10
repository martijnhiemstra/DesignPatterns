package eu.programit.decorator;

public class SimpleCoffee extends Coffee {

	@Override
	public double cost() {
		return 1.20;
	}

	@Override
	public String ingredients() {
		return "Coffee";
	}
	
}
