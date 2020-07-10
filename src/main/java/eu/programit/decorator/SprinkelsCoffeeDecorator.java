package eu.programit.decorator;

public class SprinkelsCoffeeDecorator extends Coffee {

	protected Coffee coffee;

	public SprinkelsCoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	public double cost() {
		return this.coffee.cost() + 0.5;
	}

	public String ingredients() {
		return this.coffee.ingredients() + ", Chocosprinkels";
	}

}
