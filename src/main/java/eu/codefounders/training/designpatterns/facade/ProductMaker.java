package eu.codefounders.training.designpatterns.facade;

public class ProductMaker {
	
	private Television television;

	private Laptop laptop;
	
	private Chair chair;

	public ProductMaker() {
		television = new Television();
		laptop = new Laptop();
		chair = new Chair();
	}

	public int getTelevisionPrice() {
		return television.getPrice();
	}

	public int getLaptopPrice() {
		return laptop.getPrice();
	}

	public int getChairPrice() {
		return chair.getPrice();
	}
	
}