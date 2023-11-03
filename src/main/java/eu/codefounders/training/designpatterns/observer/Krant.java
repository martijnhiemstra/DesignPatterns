package eu.codefounders.training.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Krant {

	private List<KrantObserver> observers = new ArrayList<KrantObserver>();

	private String message;

	public void sendMessage(String message) {
		this.message = message;

		notifyAllObservers();
	}

	public void attach(KrantObserver observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (KrantObserver observer : observers) {
			observer.receiveMessage(this.message);
		}
	}
}
