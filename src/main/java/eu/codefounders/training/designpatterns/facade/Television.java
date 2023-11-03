package eu.codefounders.training.designpatterns.facade;

public class Television implements Product {

	@Override
	public int getPrice() {
		System.out.println("Ik ga pijs van televisie bekendmaken");
		
		return 99;
	}
	
}
