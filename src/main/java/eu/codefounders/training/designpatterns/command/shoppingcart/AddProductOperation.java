package eu.codefounders.training.designpatterns.command.shoppingcart;

public class AddProductOperation implements ShoppingCartOperation {

	private final ShoppingCart shoppingCart;

	public AddProductOperation(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public void operation(int amount) {
		this.shoppingCart.add2(amount);
	}

}
