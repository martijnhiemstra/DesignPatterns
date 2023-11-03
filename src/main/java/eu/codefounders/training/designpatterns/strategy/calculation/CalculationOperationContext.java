package eu.codefounders.training.designpatterns.strategy.calculation;

public class CalculationOperationContext {

	private CalculationOperation operation;

	public CalculationOperationContext(CalculationOperation operation) {
		this.operation = operation;
	}
	
	public double doCalculation(int a, int b) {
		return this.operation.doOperation(a, b);
	}
	
}
