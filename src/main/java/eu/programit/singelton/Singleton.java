package eu.programit.singelton;

public class Singleton {

	// Static field kenmerk 1
	private static Singleton single_instance = null;

	// variable of type String
	public String message;

	// private constructor kenmerk 2
	private Singleton() 
    { 
        message = "Hello, I am a message from the Singleton class"; 
    }

	// kenmerk 3 - 
	public static Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
