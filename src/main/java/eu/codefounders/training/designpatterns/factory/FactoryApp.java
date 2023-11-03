package eu.codefounders.training.designpatterns.factory;

public class FactoryApp {

	public static void main(String[] args) {
		User user = UserFactory.createUser("admin");
		// user wijst naar een administrator object
		user.printRoles();

		user = UserFactory.createUser("customer");
		// user wijst naar een customer object
		user.printRoles();

		user = UserFactory.createUser("employee");
		// user wijst naar een employee object
		user.printRoles();

		user = UserFactory.createUser("customer");
		// user wijst naar een customer object
		user.printRoles();
	}

}
