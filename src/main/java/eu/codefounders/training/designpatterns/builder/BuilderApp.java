package eu.codefounders.training.designpatterns.builder;

public class BuilderApp {

	public static void main(String[] args) {
// 		Dit is hoe je zonder een builder pattern een person vult
//		Person person = new Person();
//		person.setName("Henk");
//		person.setValue(120);
//		String a = person.toString();

					// Person		Person	      Person			Person	  String	
		Person p = new Person().withActive(true).withName("Henk").withAge(23);
		System.out.println("A = " + p.toString());
		
		Person b = new Person().withName("Magreet");
		System.out.println("B = " + b);
		
		Person c = b.withAge(100).withActive(true);
		System.out.println("C = " + c);
	}
	
}
