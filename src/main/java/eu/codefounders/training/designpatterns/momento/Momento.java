package eu.codefounders.training.designpatterns.momento;

public class Momento {

	private String message;

	public Momento(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
