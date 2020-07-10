package eu.programit.command.shoppingcart;

public class ShoppingCart {

	private int productCount = 0;

	public void add(int amount) {
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
