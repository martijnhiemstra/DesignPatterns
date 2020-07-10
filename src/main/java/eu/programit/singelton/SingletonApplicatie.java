package eu.programit.singelton;

public class SingletonApplicatie {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		System.out.println(s1.getMessage());
		System.out.println(s2.getMessage());
		System.out.println(s3.getMessage());

		s3.setMessage("Een nieuwe bericht");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.getMessage());
		System.out.println(s2.getMessage());
		System.out.println(s3.getMessage());
	}

}
