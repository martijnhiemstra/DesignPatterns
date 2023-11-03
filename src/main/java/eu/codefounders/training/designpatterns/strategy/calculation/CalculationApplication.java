package eu.codefounders.training.designpatterns.strategy.calculation;

public class CalculationApplication {

	public static void main(String[] args) {

		AddOperation a = new AddOperation();

		CalculationOperationContext c = new CalculationOperationContext(a);
		System.out.println("Optellen: " + c.doCalculation(2, 4) );

		c = new CalculationOperationContext(new DivideOperation());
		System.out.println("Optellen: " + c.doCalculation(2, 4) );

	}

}
