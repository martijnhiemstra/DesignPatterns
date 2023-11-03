package eu.codefounders.training.designpatterns.proxy;

/**
 * Hier in de proxy bepaal je welke implementatie 
 * je uiteindelijk gaat aanroepen.
 */
public class ImageProxy implements Image {

	// Dit is de daadwerkelijk implementatie 
	// die wordt aangeroepen
	private Image image = new LowResImage(); 

	@Override
	public void display() {
		// Je zou zelfs hier met een variable
		// kunnen bepalen welke implementatie 
		// wordt aangeroepen
		this.image.display();
	}
	
}
