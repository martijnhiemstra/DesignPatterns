package eu.programit.factory;

public final class UserFactory {

	public static final User createUser(final String type) {
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
