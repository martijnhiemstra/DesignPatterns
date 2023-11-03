package eu.codefounders.training.designpatterns.proxy;

public class FullResImage implements Image {

	@Override
	public void display() {
		System.out.println("FullResImage: Geef fill resolutie foto weer");
	}
	
}
