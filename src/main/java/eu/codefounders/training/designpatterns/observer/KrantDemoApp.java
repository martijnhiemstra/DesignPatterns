package eu.codefounders.training.designpatterns.observer;

/**
 * Bij een observer pattern kan een "klant" zich
 * aanmelden bij datgene waar ze voor willen 
 * registeren/aanmelden. Het is net als een mailing
 * lijst waar iemand zich daarvoor kan aanmelden.
 * Daarna kan bijvoorbeeld de mailinglijst een
 * bericht sturen en dan zal iedereen die zich
 * heeft aangemeld een bericht krijgen.
 * 
 * @author Martijn Hiemstra
 */
public class KrantDemoApp {

	public static void main(String[] args) {
		Krant krant = new Krant(); // Krant

		new Klant(krant); // Leden
		new Winkel(krant); // Leden 

		System.out.println("Eerste bericht");
		krant.sendMessage("Dit is mijn eerste bericht");

		System.out.println("Tweede bericht");
		krant.sendMessage("Dit is mijn tweede bericht");
	}

}
