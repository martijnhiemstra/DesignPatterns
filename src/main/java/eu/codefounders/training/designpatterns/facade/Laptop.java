package eu.codefounders.training.designpatterns.facade;

public class Laptop implements Product {

	@Override
	public int getPrice() {
		System.out.println("Ik ga de prijs van een laptop bekend maken");
		
		return 100;
	}
	
}
