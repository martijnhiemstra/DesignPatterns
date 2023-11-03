package eu.codefounders.training.designpatterns.strategy.calculation;

public class DivideOperation implements CalculationOperation{

	@Override
	public double doOperation(int a, int b) {
		return a / (double)b;
	}
	
}
