package eu.codefounders.training.designpatterns.strategy.sender;

public class SenderContext {

	private Sender sender;

	public SenderContext(Sender sender) {
		this.sender = sender;
	}

	public String executeStrategy(String message) {
		return sender.doOperation(message);
	}

}
