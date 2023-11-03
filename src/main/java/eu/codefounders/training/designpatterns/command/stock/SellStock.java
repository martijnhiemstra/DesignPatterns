package eu.codefounders.training.designpatterns.command.stock;

/*
 * Buy stock is een opdracht om een aandeel te verkopen 
 */
public class SellStock implements Command {

	private Stock myStock;

	public SellStock(Stock myStock) {
		this.myStock = myStock;
	}

	public void execute() {
		myStock.sell();
	}
	
}