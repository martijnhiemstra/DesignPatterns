package eu.codefounders.training.designpatterns.command.shoppingcart;

public class ShoppingCart {

	private int productCount = 0;

	public void add2(int amount) {
		this.productCount += amount;
	}

	public void update(int amount) {
		this.productCount = amount;
	}

	public void delete(int amount) {
		this.productCount -= amount;
	}

	public int getProductCount() {
		return productCount;
	}

}
