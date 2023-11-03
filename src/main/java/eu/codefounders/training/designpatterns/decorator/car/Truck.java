package eu.codefounders.training.designpatterns.decorator.car;

import java.util.Arrays;
import java.util.List;

public class Truck extends Car {

	@Override
	public double costs() {
		return 18500;
	}

	@Override
	public List<String> opties() {
		return Arrays.asList("Door", "Mirror");
	}
	
}
