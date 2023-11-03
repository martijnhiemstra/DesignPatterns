package eu.codefounders.training.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;

import eu.codefounders.training.designpatterns.encapsulation.Person;

/*
 * Person respository bevat een lijst van persons en hierin zit een PersonIterator.
 * 
 * De PersonIterator gaat de lijst van persons langs en door de PersonIterator 
 * 	hoeft de buitenwereld geen toegang te hebben tot de persons lijst. Alles
 *  gaat via de iterator
 */
public class PersonRepository {

	private final List<Person> persons;

	public PersonRepository(List<Person> persons) {
		this.persons = persons;
	}

	public Iterator<Person> getIterator() {
		return new PersonIterator();
	}

	private class PersonIterator implements Iterator<Person> {

		int index;

		@Override
		public boolean hasNext() {

			if (index < persons.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Person next() {
			return persons.get(index++);
		}
	}

}
