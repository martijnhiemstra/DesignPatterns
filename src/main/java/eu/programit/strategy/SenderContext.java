package eu.programit.strategy;

public class SenderContext {

	private Sender strategy;

	public SenderContext(Sender strategy) {
		this.strategy = strategy;
	}

	public String executeStrategy(String message) {
		return strategy.doOperation(message);
	}

}
