package eu.codefounders.training.designpatterns.factory;

public class Administrator extends User {

	@Override
	public void printRoles() {
		System.out.println("ROLE_ADMIN");
	}
	
	public void doIetsVanAdmin() {
		
	}
	
}
