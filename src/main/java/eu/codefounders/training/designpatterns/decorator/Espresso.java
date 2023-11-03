package eu.codefounders.training.designpatterns.decorator;

public class Espresso extends AbstractCoffee {

	@Override
	public double cost() {
		return 1.80;
	}

	@Override
	public String ingredients() {
		return "Espresso";
	}
	
}
