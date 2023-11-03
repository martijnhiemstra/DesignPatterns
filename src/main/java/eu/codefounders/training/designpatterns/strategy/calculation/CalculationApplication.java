package eu.codefounders.training.designpatterns.strategy.calculation;

/*
 * Met de strategy design pattern kunnen we de daadwerkelijk uitgevoerde method
 *  verbergen dmv een tussen class genaamd CalculationOperationContext. 
 *  Dus CalculationOperationContext die roepen wij aan en die roept de dadwerkelijk
 *  operation aan.
 *
 * Dit maakt het mogelijk om onze code te scheiden van de daadwerkelijk operatie. Wij
 *  hoeven niet te weten welke methode in CalculationOperation wordt aangeroepen. Tevens 
 *  maakt het mogelijk om onze operations uit te breiden met nieuwe operations dmv nieuwe
 *  operations zonder dat onze applicatie aangepast wordt
 */
public class CalculationApplication {

	public static void main(String[] args) {

		AddOperation addOperation = new AddOperation();
		DivideOperation divideOperation = new DivideOperation();

		CalculationOperationContext c = new CalculationOperationContext(addOperation);
		System.out.println("Optellen: " + c.doCalculation(2, 4) );

		CalculationOperationContext d = new CalculationOperationContext(divideOperation);
		System.out.println("Divide: " + d.doCalculation(2, 6) );

	}

}
