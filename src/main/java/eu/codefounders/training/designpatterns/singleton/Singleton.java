package eu.codefounders.training.designpatterns.singleton;

public class Singleton {

	// Static field kenmerk 2
	private static Singleton single_instance;

	// variable of type String
	private String message;
	
	private int test = 5;

	// private constructor kenmerk 1
	private Singleton() 
    { 
		System.out.println("I am in the constructor");
        message = "Hello, I am a message from the Singleton class"; 
    }

	// kenmerk 3 - Singleton.getInstance()
	public static Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
	
	public int getTest() {
		return test;
	}
	
	public void setTest(int test) {
		this.test = test;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
