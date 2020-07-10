package eu.programit.decorator;

public class SugarCoffeeDecorator extends Coffee {
	
	private Coffee coffee;

	public SugarCoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	public double cost() {
		return this.coffee.cost() + 0.2;
	}

	public String ingredients() {
		return this.coffee.ingredients() + ", Milk";
	}

}
