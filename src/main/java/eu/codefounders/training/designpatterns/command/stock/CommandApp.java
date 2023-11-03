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

		// Maak een broker aan die commands gaat verzamelen
		Broker broker = new Broker();
		// Voeg opdrachten toe
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();

	}

}
