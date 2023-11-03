package eu.codefounders.training.designpatterns.decorator.car;

import java.util.ArrayList;
import java.util.List;

public class AircoDecorator extends Car {

	private Car originalCar;

	public AircoDecorator(Car originalCar) {
		this.originalCar = originalCar;
	}

	@Override
	public double costs() {
		return originalCar.costs() + 2000;
	}

	@Override
	public List<String> opties() {
		List<String> newOpties = new ArrayList<>( originalCar.opties() );
		newOpties.add("Airco");
		return newOpties;
	}
	
}
