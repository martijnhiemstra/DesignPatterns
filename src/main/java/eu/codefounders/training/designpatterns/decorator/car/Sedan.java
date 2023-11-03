package eu.codefounders.training.designpatterns.decorator.car;

import java.util.Arrays;
import java.util.List;

public class Sedan extends Car {

	@Override
	public double costs() {
		return 30000;
	}

	@Override
	public List<String> opties() {
		return Arrays.asList("Brake", "Door");
	}

}
