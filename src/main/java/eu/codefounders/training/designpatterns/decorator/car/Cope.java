package eu.codefounders.training.designpatterns.decorator.car;

import java.util.Arrays;
import java.util.List;

public class Cope extends Car {

	@Override
	public double costs() {
		return 22000;
	}

	@Override
	public List<String> opties() {
		return Arrays.asList("Brake", "Roof");
	}
	
}
