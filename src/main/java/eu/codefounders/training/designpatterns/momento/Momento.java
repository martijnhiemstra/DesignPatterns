package eu.codefounders.training.designpatterns.momento;

/*
 * Momento is een class waar we onze data in willen bewaren. We kunnen o.a een 
 * String, Object, primative opslaan in de momento. Dit is de daadwerkelijke moment opname
 */
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
