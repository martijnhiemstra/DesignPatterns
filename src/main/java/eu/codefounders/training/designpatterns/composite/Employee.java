package eu.codefounders.training.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/*
 * Employee is een class die een lijst heeft van employee's. 
 * 	
 * Dus een CEO heeft lijst van managers en de managers
 *  hebben een lijst van medewerkers
 * 
 */
public class Employee {

	private String name;

	private String dept;

	private int salary;

	/*
	 * Dit is de composite design pattern dat employee een lijst van employees 
	 */
	private List<Employee> subordinates;

	// constructor
	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;

		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
	}

}