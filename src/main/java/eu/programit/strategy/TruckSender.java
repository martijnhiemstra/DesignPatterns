package eu.programit.strategy;

public class TruckSender implements Sender {

	@Override
	public String doOperation(String message) {
		return "Truck send: " + message;
	}

}