package eu.codefounders.training.designpatterns.command.stock;

public class BuyStock implements Order {

	private Stock myStock;

	public BuyStock(Stock myStock) {
		this.myStock = myStock;
	}

	public void execute() {
		myStock.buy();
	}

}
