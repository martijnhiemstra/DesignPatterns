package eu.codefounders.training.designpatterns.decorator.car;

import java.util.ArrayList;
import java.util.List;

public class RearViewMirrorCameraControlDecorator extends Car {

	private Car originalCar;

	public RearViewMirrorCameraControlDecorator(Car originalCar) {
		this.originalCar = originalCar;
	}

	@Override
	public double costs() {
		return originalCar.costs() + 800;
	}

	@Override
	public List<String> opties() {
		List<String> newOpties = new ArrayList<>( originalCar.opties() );
		newOpties.add("Rear view mirror camera");
		return newOpties;
	}
	
}
