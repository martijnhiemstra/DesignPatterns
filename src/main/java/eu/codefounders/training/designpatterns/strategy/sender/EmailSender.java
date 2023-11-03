package eu.codefounders.training.designpatterns.strategy.sender;

public class EmailSender implements Sender {

	@Override
	public String doOperation(String message) {
		// Hier kunnen we daadwerkelijk
		// een email versturen
		
		return "Email send: " + message;
	}

}
