package eu.codefounders.training.designpatterns.proxy;

/**
 * Proxy is een pattern waarmee we ervoor kunnen zorgen dat de 
 * aanroeper, in dit voorbeeld de main methode, niet weet welke 
 * implementatie er wordt aangeroepen.
 */
public class ImageApp {

	public static void main(String[] args) {
		ImageProxy ip = new ImageProxy();
		ip.display();
	}

}
