package eu.programit.decorator;

public class Espresso extends Coffee {

	@Override
	public double cost() {
		return 1.80;
	}

	@Override
	public String ingredients() {
		return "Espresso";
	}
	
}
