package eu.programit.strategy;

public class AirplaneSender implements Sender {

	@Override
	public String doOperation(String message) {
		return "Airplane send: " + message;
	}

}