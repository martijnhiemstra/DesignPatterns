package eu.programit.observer;

public class KrantDemo {

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
