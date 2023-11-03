package eu.codefounders.training.designpatterns.chainof;

public class StringStartsWithUppercaseFilter extends AbstractStringFilter{

	@Override
	protected void checkString(String message) {
		char firstCharacter = message.charAt(0);

		if (Character.isUpperCase( firstCharacter )) {
			System.out.println("String start met een hoofdletter");
		}
	}

}
