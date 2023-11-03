package eu.codefounders.training.designpatterns.strategy.sender;

/**
 * Bij de strategy pattern ga je ervoor zorgen 
 * dat de daadwerkelijk methode in Sender  
 * wordt gescheiden van de aanroeper door een 
 * tussen class. Hierdoor hoeft de aanroeper, 
 * in dit geval de main methode, niet te weten 
 * welke methode in de sender wordt aangeroepen
 * 
 * @author Martijn Hiemstra
 *
 */
public class StrategyApp {

	public static void main(String[] args) {
		// ------ Alternatief zonder context. What is de nadeel van deze oplossing
		System.out.println("Start met variant zonder strategy pattern");

		EmailSender emailSender = new EmailSender();
		System.out.println(emailSender.doOperation("Message 1"));

		AirplaneSender airplaneSender = new AirplaneSender();
		System.out.println(airplaneSender.doOperation("Message 2"));

		TruckSender truckSender = new TruckSender();
		System.out.println(truckSender.doOperation("Message 3"));


		System.out.println("");
		System.out.println("Start met sender context");

		SenderContext senderContext = new SenderContext(new EmailSender());
		System.out.println(senderContext.executeStrategy("Message 1"));

		senderContext = new SenderContext(new AirplaneSender());
		System.out.println(senderContext.executeStrategy("Message 2"));

		senderContext = new SenderContext(new TruckSender());
		System.out.println(senderContext.executeStrategy("Message 3"));
	}

}
