package eu.codefounders.training.designpatterns.command.stock;

/*
 * Buy stock is een opdracht om een aandeel te kopen 
 */
public class BuyStock implements Command {

	private Stock myStock;

	public BuyStock(Stock myStock) {
		this.myStock = myStock;
	}

	public void execute() {
		myStock.buy();
	}

}
