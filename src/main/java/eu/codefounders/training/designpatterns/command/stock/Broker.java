package eu.codefounders.training.designpatterns.command.stock;

import java.util.ArrayList;
import java.util.List;

/*
 * Broker is een verzamelaar van commands.
 * 
 * 	takeOrder daar kan je commands toevoegen (opstapelen)
 * 
 *  placeOrders die voert alle commands uit die zijn opgestapelen zodat deze in een
 *  	keer worden uitgevoerd
 */
public class Broker {

	private List<Command> orderList = new ArrayList<Command>();

	public void takeOrder(Command order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Command order : orderList) {
			order.execute();
		}

		orderList.clear();
	}
	
}