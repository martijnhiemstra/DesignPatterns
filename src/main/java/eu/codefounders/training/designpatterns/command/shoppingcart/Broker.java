package eu.codefounders.training.designpatterns.command.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<ShoppingCartOperation> operations = new ArrayList<>();

	public void addOperation(ShoppingCartOperation operation) {
		operations.add(operation);
	}

	public void placeOrders() {
		for (ShoppingCartOperation shoppingCartOperation : operations) {
			shoppingCartOperation.operation(1);
		}

		operations.clear();
	}

}