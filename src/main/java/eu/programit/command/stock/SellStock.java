package eu.programit.command.stock;

public class SellStock implements Order {
	
	private Stock myStock;

	public SellStock(Stock myStock) {
		this.myStock = myStock;
	}

	public void execute() {
		myStock.sell();
	}
	
}