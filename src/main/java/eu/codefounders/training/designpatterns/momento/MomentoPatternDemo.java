package eu.codefounders.training.designpatterns.momento;

public class MomentoPatternDemo {

	public static void main(String[] args) {
		// EditorContent keeper is een lijst van moment opnames
		MomentoKeeper momentKeeper = new MomentoKeeper();

		EditorContent editorContent = new EditorContent();
		editorContent.setMessage("Bericht #1");
		editorContent.setMessage("Bericht #2");
		editorContent.setMessage("Bericht #3");
		editorContent.setMessage("Bericht #4");

		Momento m = editorContent.saveEditorContentToMemento();
		momentKeeper.add(m);

		editorContent.setMessage("Bericht #5");
		momentKeeper.add(editorContent.saveEditorContentToMemento());

		editorContent.setMessage("Bericht #6");
		System.out.println("Current EditorContent: " + editorContent.getMessage());

		editorContent.getEditorContentFromMemento(momentKeeper.get(0));
		System.out.println("First saved EditorContent: " + editorContent.getMessage());
		editorContent.getEditorContentFromMemento(momentKeeper.get(1));
		System.out.println("Second saved EditorContent: " + editorContent.getMessage());
	}

}