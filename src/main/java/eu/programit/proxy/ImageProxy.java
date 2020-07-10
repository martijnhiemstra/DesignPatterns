package eu.programit.proxy;

public class ImageProxy implements Image {

	private FullResImage image = new FullResImage(); // Of lowresImage

	@Override
	public void display() {
		this.image.display();
	}
	
}
