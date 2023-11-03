package eu.codefounders.training.designpatterns.facade;

public class FacadeDemo {

	public static void main(String[] args) {
		ProductMaker productMaker = new ProductMaker();

		int priceTV = productMaker.getTelevisionPrice();
		int laptopPrice = productMaker.getLaptopPrice();
		int chairPrice = productMaker.getChairPrice();

		System.out.println("TV price = " + priceTV);
		System.out.println("Laptop price = " + laptopPrice);
		System.out.println("Chair price = " + chairPrice);
	}

}
