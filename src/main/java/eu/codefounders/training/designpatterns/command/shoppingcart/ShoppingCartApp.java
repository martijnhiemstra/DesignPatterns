package eu.codefounders.training.designpatterns.command.shoppingcart;

public class ShoppingCartApp {

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();

		ShoppingCartOperation addOperation = new AddProductOperation(shoppingCart);
		ShoppingCartOperation deleteOperation = new DeleteProductOperation(shoppingCart);

		Broker broker = new Broker();
		broker.addOperation(addOperation);
		broker.addOperation(deleteOperation);

		broker.placeOrders();

	}

}
