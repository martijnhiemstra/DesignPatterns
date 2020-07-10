package eu.programit.command.shoppingcart;

public class AddProductOperation implements ShoppingCartOperation {

	private final ShoppingCart shoppingCart;

	public AddProductOperation(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public void operation(int amount) {
		this.shoppingCart.add(amount);
	}

}
