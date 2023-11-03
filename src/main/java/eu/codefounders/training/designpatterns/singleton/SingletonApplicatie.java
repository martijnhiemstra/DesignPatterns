package eu.codefounders.training.designpatterns.singleton;

/**
 * Singleton design pattern wordt gebruikt om ervoor
 * te zorgen dat er van die class maar 1 object wordt
 * aangemaakt. 
 * 
 * @author Martijn Hiemstra
 */
public class SingletonApplicatie {

	public static void main(String[] args) {
		// Dit kan niet want constructor is private
		// new Singleton();
		
		// Wij maken 3 singletons aan en door de
		// getInstance krijgen wij elke keer 
		// hetzelfde object terug.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		// Elke message zal dus hetzelfde zijn
		System.out.println(s1.getMessage());
		System.out.println(s2.getMessage());
		System.out.println(s3.getMessage());

		// Met == kunnen we checken dat de objecten
		// naar hetzelfde plek in het geheugen 
		// wijzen
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));

		// we veranderen het message in any
		// singelton
		s3.setMessage("Een nieuwe bericht");

		// Nu is de message in alle singletons aangepast
		System.out.println(s1.getMessage());
		System.out.println(s2.getMessage());
		System.out.println(s3.getMessage());
	}
	
	private static void nextMethod() {
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s1.getMessage());
	}

}
