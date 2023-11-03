package eu.codefounders.training.designpatterns.command.stock;

public class SellStock implements Order {

	private Stock myStock;

	public SellStock(Stock myStock) {
		this.myStock = myStock;
	}

	public void execute() {
		myStock.sell();
	}
	
}