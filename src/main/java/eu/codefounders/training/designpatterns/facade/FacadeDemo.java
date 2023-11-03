package eu.codefounders.training.designpatterns.facade;

public class FacadeDemo {

	/*
	 * Bij een facade pattern kunnen we bijvoorbeeld een property afschermen
	 * voor de buiten wereld door een tussen class te maken, hier ProductMaker
	 * genoemd, die een methode heeft zoals getChairPrice en die roept de prijs aan
	 * in chair
	 * 
	 * De buitenwereld gebruikt ProductMaker en hebben niet door dat die de Chair,
	 * TV of laptop aanroept
	 */
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
