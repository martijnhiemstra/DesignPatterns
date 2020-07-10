package eu.programit.builder;

public class BuilderApp {

	public static void main(String[] args) {
		String a = MyBuilder.create().withName("Henk").withValue(120).toString();

		System.out.println("A = " + a);
	}

}
