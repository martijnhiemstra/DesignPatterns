package eu.programit.strategy;

public class StrategyApp {

	public static void main(String[] args) {
		System.out.println("Start met sender context");

		SenderContext senderContext = new SenderContext(new EmailSender());
		System.out.println(senderContext.executeStrategy("Message 1"));

		senderContext = new SenderContext(new AirplaneSender());
		System.out.println(senderContext.executeStrategy("Message 2"));

		senderContext = new SenderContext(new TruckSender());
		System.out.println(senderContext.executeStrategy("Message 3"));


		// ------ Alternatief zonder context. What is de nadeel van deze oplossing
		System.out.println("Start met alternatief");

		EmailSender emailSender = new EmailSender();
		System.out.println(emailSender.doOperation("Message 1"));

		AirplaneSender airplaneSender = new AirplaneSender();
		System.out.println(airplaneSender.doOperation("Message 2"));

		TruckSender truckSender = new TruckSender();
		System.out.println(truckSender.doOperation("Message 3"));

	}

}
