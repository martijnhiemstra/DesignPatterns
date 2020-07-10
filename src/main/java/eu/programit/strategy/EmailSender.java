package eu.programit.strategy;

public class EmailSender implements Sender {

	@Override
	public String doOperation(String message) {
		return "Email send: " + message;
	}

}
