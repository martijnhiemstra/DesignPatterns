package eu.codefounders.training.designpatterns.decorator;

public class MilkCoffeeDecorator extends AbstractCoffee {

	protected AbstractCoffee coffee;

	public MilkCoffeeDecorator(AbstractCoffee coffee) {
		this.coffee = coffee;
	}

	public double cost() {
		return this.coffee.cost() + 0.2;
	}

	public String ingredients() {
		return this.coffee.ingredients() + ", Milk";
	}

}
