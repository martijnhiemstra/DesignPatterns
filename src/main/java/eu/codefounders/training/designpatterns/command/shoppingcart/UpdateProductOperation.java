package eu.codefounders.training.designpatterns.command.shoppingcart;

public class UpdateProductOperation implements ShoppingCartOperation {

	private final ShoppingCart shoppingCart;

	public UpdateProductOperation(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public void operation(int amount) {
		this.shoppingCart.delete(amount);
	}

}
