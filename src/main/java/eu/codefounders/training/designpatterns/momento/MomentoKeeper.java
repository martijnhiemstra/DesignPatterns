package eu.codefounders.training.designpatterns.momento;

import java.util.ArrayList;
import java.util.List;

public class MomentoKeeper {

	private List<Momento> momentoList = new ArrayList<>();

	public void add(Momento state) {
		momentoList.add(state);
	}

	public Momento get(int index) {
		return momentoList.get(index);
	}

	public int count() {
		return momentoList.size();
	}

	public void print() {
		for (int i = 0; i < momentoList.size(); i++) {
			System.out.println("  Index: " + i + " - Message: " + momentoList.get(i).getMessage() );
		}
	}

}
