package eu.programit.command.stock;

public class CommandApp {

	public static void main(String[] args) {
		
		// ----- Command pattern

		Stock myStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(myStock);
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
