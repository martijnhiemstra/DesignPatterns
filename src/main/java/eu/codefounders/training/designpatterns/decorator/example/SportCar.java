package eu.codefounders.training.designpatterns.decorator.example;

import java.util.Arrays;
import java.util.List;

public class SportCar extends Car {

	@Override
	public double costs() {
		return 42000;
	}

	@Override
	public List<String> opties() {
		return Arrays.asList("Door", "Mirror", "Brake", "Wheels");
	}
	
}
