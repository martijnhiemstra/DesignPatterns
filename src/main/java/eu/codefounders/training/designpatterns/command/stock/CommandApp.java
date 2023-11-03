package eu.codefounders.training.designpatterns.command.stock;

public class CommandApp {

	public static void main(String[] args) {
		
		// ----- Command pattern

		// Deze stock gaan we iets mee doen
		Stock myStock = new Stock();

		// Maak een actie aan om de stock te kopen
		BuyStock buyStockOrder = new BuyStock(myStock);

		// Maak een actie aan om de stock te verkopen
		SellStock sellStockOrder = new SellStock(myStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();

		
		// ------ Alternatieve manier zonder design pattern
		
		BuyStock buyStockOrderAlt = new BuyStock(myStock);
		buyStockOrderAlt.execute(); // of
		myStock.buy();

		SellStock sellStockOrderAlt = new SellStock(myStock);
		sellStockOrderAlt.execute();
		
	}

}
