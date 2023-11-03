package eu.codefounders.training.designpatterns.encapsulation;

public class EncapsulationApp {
	
	public static void main(String[] args) {
		System.out.println("Start applicatie");

		Person p = new Person();
		p.setFirstName("Henk");
		p.setLastName("Jansen");
		p.setAge(23);

		System.out.println("Persoon 1 is aangemaakt");

		Person p2 = new Person();
		p2.setFirstName("Rebecca");
		p2.setLastName("Jasmijn");
		p2.setAge(-2);

		System.out.println("Persoon 2 is aangemaakt");
}

}
