package eu.codefounders.training.designpatterns.decorator.car;

import java.util.ArrayList;
import java.util.List;

public class CruiseControlDecorator extends Car {

	private Car originalCar;

	public CruiseControlDecorator(Car originalCar) {
		this.originalCar = originalCar;
	}

	@Override
	public double costs() {
		return originalCar.costs() + 2500;
	}

	@Override
	public List<String> opties() {
		List<String> newOpties = new ArrayList<>( originalCar.opties() );
		newOpties.add("Cruise Control");
		return newOpties;
	}
	
}
