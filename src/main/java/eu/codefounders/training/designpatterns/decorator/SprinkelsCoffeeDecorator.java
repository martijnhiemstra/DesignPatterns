package eu.codefounders.training.designpatterns.decorator;

public class SprinkelsCoffeeDecorator extends AbstractCoffee {

	private AbstractCoffee coffee;

	public SprinkelsCoffeeDecorator(AbstractCoffee coffee) {
		this.coffee = coffee;
	}

	public double cost() {
		return this.coffee.cost() + 0.5;
	}

	public String ingredients() {
		return this.coffee.ingredients() + ", Chocosprinkels";
	}

}
