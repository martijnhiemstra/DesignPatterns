package eu.codefounders.training.designpatterns.strategy.sender;

public class TruckSender implements Sender {

	@Override
	public String doOperation(String message) {
		return "Truck send: " + message;
	}

}