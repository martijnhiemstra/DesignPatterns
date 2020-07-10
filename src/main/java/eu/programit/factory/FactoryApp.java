package eu.programit.factory;

public class FactoryApp {

	public static void main(String[] args) {
		User user = UserFactory.createUser("admin");
		user.printRoles();

		user = UserFactory.createUser("customer");
		user.printRoles();

		user = UserFactory.createUser("employee");
		user.printRoles();
	}

}
