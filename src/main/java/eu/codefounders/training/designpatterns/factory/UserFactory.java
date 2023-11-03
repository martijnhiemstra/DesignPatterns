package eu.codefounders.training.designpatterns.factory;

public class UserFactory {

	public static User createUser(String type) {
		switch (type) {
			case "admin":
				return new Administrator();
	
			case "employee":
				return new Employee();
	
			case "customer":
				return new Customer();
		}

		return null;
	}

}
