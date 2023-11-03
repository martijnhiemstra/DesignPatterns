package eu.codefounders.training.designpatterns.proxy;

public class LowResImage implements Image {

	@Override
	public void display() {
		System.out.println("LowResImage: Geef low resolutie foto weer");
	}
	
}
