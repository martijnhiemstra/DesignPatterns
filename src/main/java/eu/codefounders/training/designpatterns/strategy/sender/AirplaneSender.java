package eu.codefounders.training.designpatterns.strategy.sender;

public class AirplaneSender implements Sender {

	@Override
	public String doOperation(String message) {
		return "Airplane send: " + message;
	}

}