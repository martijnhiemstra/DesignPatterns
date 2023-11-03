package eu.codefounders.training.designpatterns.observer;

public class Klant extends KrantObserver {

	public Klant(Krant krant) {
		krant.attach(this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(this.getClass().getSimpleName() + " heeft een bericht ontvangen. Bericht = " + message );
	}

}