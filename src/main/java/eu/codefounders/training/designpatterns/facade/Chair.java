package eu.codefounders.training.designpatterns.facade;

public class Chair implements Product {

	@Override
	public int getPrice() {
		System.out.println("Ik ga de prijs van een stoel bekend maken");
		
		return 49;
	}
	
}
