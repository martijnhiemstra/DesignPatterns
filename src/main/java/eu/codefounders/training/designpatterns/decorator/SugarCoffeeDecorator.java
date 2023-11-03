package eu.codefounders.training.designpatterns.decorator;

public class SugarCoffeeDecorator extends AbstractCoffee {
	
	private AbstractCoffee coffee;

	public SugarCoffeeDecorator(AbstractCoffee coffee) {
		this.coffee = coffee;
	}

	public double cost() {
		return this.coffee.cost() + 0.2;
	}

	public String ingredients() {
		return this.coffee.ingredients() + ", Sugar";
	}

}
