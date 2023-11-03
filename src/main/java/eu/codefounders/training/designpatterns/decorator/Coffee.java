package eu.codefounders.training.designpatterns.decorator;

public class Coffee extends AbstractCoffee {

	@Override
	public double cost() {
		return 1.20;
	}

	@Override
	public String ingredients() {
		return "Coffee";
	}
	
}
