package eu.codefounders.training.designpatterns.chainof;

public abstract class AbstractStringFilter {

	protected AbstractStringFilter nextFilter;
	
	public void setNextFilter(AbstractStringFilter nextFilter) {
		this.nextFilter = nextFilter;
	}
	
	public void checkFilter(String message) {
		checkString(message);
		
		if (nextFilter != null) {
			nextFilter.checkFilter(message);
		}
	}
	
	protected abstract void checkString(String message);
	
}
