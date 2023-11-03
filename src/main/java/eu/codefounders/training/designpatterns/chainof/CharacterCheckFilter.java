package eu.codefounders.training.designpatterns.chainof;

public class CharacterCheckFilter extends AbstractStringFilter {

	private String matchText;
	
	public CharacterCheckFilter(String matchText) {
		this.matchText = matchText;
	}

	@Override
	protected void checkString(String message) {
		if (message.contains(this.matchText)) {
			System.out.println("Message bevat " + matchText);
		}
	}
	
	// Character.isUpperCase
	
	// 

}
