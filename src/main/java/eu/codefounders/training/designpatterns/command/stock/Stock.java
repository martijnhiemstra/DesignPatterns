package eu.codefounders.training.designpatterns.command.stock;

public class Stock {

	private String name = "ABC";

	private int quantity = 10;

	public void buy() {
		quantity++;
		System.out.println("Stock [ Name: " + name + " - Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		quantity--;
		System.out.println("Stock [ Name: " + name + " - Quantity: " + quantity + " ] sold");
	}
	
}
