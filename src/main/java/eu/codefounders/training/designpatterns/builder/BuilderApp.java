package eu.codefounders.training.designpatterns.builder;

public class BuilderApp {

	public static void main(String[] args) {
// 		Dit mag niet want constructor is private en er zijn geen setters
//		Person person = new Person();
//		person.setName("Henk");
//		person.setValue(120);
//		String a = person.toString();

					// Person		Person	      Person			Person	  String	
		Person p = new Person().withActive(true).withName("Henk").withAge(23);
		System.out.println("A = " + p.toString());
		
		Person b = new Person().withName("Magreet");
		System.out.println("B = " + b);
		
		printMyBuilder(b);
	}
	
	public static void printMyBuilder(Person p) {
		String c = p.withAge(100).withActive(true).toString();
		System.out.println("C = " + c);
	}

}
