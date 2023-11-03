package eu.codefounders.training.designpatterns.factory;

/*
 * De factory app maakt objecten aan aan de hand van een specifiek input
 * 
 * Hier geven we een string mee aan de UserFactory en die maakt een user object aan
 */
public class FactoryApp {

	public static void main(String[] args) {
		User user = UserFactory.createUser("admin");
		// user wijst runtime naar een administrator object
		user.printRoles();

		user = UserFactory.createUser("customer");
		// user wijst runtime naar een customer object
		user.printRoles();

		user = UserFactory.createUser("employee");
		// user wijst runtime naar een employee object
		user.printRoles();

		user = UserFactory.createUser("customer");
		// user wijst runtime naar een customer object
		user.printRoles();
	}

}
