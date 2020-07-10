package eu.programit.decorator;

public class MilkCoffeeDecorator extends Coffee {

	protected Coffee coffee;

	public MilkCoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	public double cost() {
		return this.coffee.cost() + 0.2;
	}

	public String ingredients() {
		return this.coffee.ingredients() + ", Milk";
	}

}
