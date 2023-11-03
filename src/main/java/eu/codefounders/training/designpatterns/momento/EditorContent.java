package eu.codefounders.training.designpatterns.momento;

public class EditorContent {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public Momento saveEditorContentToMemento() {
		return new Momento(message);
	}

	public void getEditorContentFromMemento(Momento memento) {
		message = memento.getMessage();
	}

}