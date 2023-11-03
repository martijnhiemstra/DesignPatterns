package eu.codefounders.training.designpatterns.decorator;

public class DecoratorApp {

	public static void main(String[] args) {
		AbstractCoffee coffee = new Coffee();
		AbstractCoffee milkDecorator = new MilkCoffeeDecorator(coffee);
		AbstractCoffee sprinkelsDecorator = new SprinkelsCoffeeDecorator(milkDecorator);

		// new MilkCoffeeDecorator(new SprinkelsCoffeeDecorator(new SimpleCoffee()));

		System.out.println("Coffee - Cost: " + sprinkelsDecorator.cost() + " - Ingredients: " + sprinkelsDecorator.ingredients());

		

		AbstractCoffee espresso = new Espresso();
		espresso = new SugarCoffeeDecorator(espresso);

		System.out.println("Espresso - Cost: " + espresso.cost() + " - Ingredients: " + espresso.ingredients());
	}
	
	/**
	 * Pizza -> TomatoTopping -> CheeseTopping -> Param
	 * 
	 * Cake -> Slagroom -> Sprinkles -> 
	 */

}
