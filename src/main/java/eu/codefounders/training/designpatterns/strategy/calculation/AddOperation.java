package eu.codefounders.training.designpatterns.strategy.calculation;

public class AddOperation implements CalculationOperation {

	@Override
	public double doOperation(int a, int b) {
		return a + b;
	}
	
}
