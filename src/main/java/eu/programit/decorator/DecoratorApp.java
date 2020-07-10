package eu.programit.decorator;

public class DecoratorApp {

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		coffee = new SprinkelsCoffeeDecorator(coffee);
		coffee = new MilkCoffeeDecorator(coffee);

		System.out.println("SimpleCoffee - Cost: " + coffee.cost() + " - Ingredients: " + coffee.ingredients());


		Coffee espresso = new Espresso();
		espresso = new SprinkelsCoffeeDecorator(espresso);
		espresso = new MilkCoffeeDecorator(espresso);

		System.out.println("Espresso - Cost: " + espresso.cost() + " - Ingredients: " + espresso.ingredients());
	}

}
