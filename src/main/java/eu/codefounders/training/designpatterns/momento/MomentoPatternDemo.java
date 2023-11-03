package eu.codefounders.training.designpatterns.momento;

/*
 * De momento pattern geeft ons de mogelijkheid om een lijst van states op te slaan. 
 *  
 * Een state is een letterlijke moment opname vandaar de naam Momento.
 *  Stel je voor je hebt een person object met een name en age. De state is
 *  de inhoud van de properties op dat moment. Dus als de naam Henk is en leeftijd
 *  45 dan is dat de state. In dit voorbeeld gebruiken we String message.
 *  
 *  De EditorContent bewaart de laatste message en pas als we die gaan opslaan 
 *   dan roepen we saveEditorContentToMemento aan en wordt de momento opgeslagen
 */
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