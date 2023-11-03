package eu.codefounders.training.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import eu.codefounders.training.designpatterns.encapsulation.Person;

public class IteratorApp {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person());
		persons.add(null);
		PersonRepository namesRepository = new PersonRepository(persons);

		for (Iterator<Person> iter = namesRepository.getIterator(); iter.hasNext();) {
			Person p = iter.next();
			System.out.println("Person firstName: " + p.getFirstName());
		}
		
		for (;;) {
			System.out.println("TEst");
		}
		
		// for ( init ; condition ; post statement)
	}

}
