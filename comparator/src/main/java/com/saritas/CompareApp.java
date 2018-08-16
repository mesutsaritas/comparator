package com.saritas;

import java.util.ArrayList;
import java.util.List;

import com.saritas.comparator.PersonComparator;
import com.saritas.enums.SortParameter;
import com.saritas.model.Person;

/**
 * @author msaritas
 *
 */
public class CompareApp {

	public void comparePerson() {
		Person person = Person.builder().setAge(20).setFirstName("Mert Karayel").build();
		Person person1 = Person.builder().setAge(28).setFirstName("Mesut Sarıtaş").build();
		Person person2 = Person.builder().setAge(40).setFirstName("Mikhael").build();

		List<Person> persons = new ArrayList<Person>();
		persons.add(person);
		persons.add(person1);
		persons.add(person2);

		PersonComparator comparator = new PersonComparator(SortParameter.NAME_ASCENDING);
		comparator.compare(persons)
				.forEach(e -> System.out.println("Age:" + e.getAge() + ", Name: " + e.getFirstName()));
	}

}
