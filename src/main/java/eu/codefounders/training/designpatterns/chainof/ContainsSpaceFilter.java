package eu.codefounders.training.designpatterns.chainof;

public class ContainsSpaceFilter extends AbstractStringFilter {

	@Override
	protected void checkString(String message) {
		if (message.contains(" ")) {
			System.out.println("String bevat spatie");
		}
	}
	
}
