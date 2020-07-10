package eu.programit.command.shoppingcart;

public class DeleteProductOperation implements ShoppingCartOperation {

	private final ShoppingCart shoppingCart;

	public DeleteProductOperation(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public void operation(int amount) {
		this.shoppingCart.delete(amount);
	}

}
