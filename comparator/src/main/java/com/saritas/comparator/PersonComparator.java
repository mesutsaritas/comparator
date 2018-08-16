package com.saritas.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.saritas.enums.SortParameter;
import com.saritas.model.Person;

/**
 * @author msaritas
 *
 */
public class PersonComparator {

	private SortParameter parameter;

	public PersonComparator(SortParameter parameter) {
		this.parameter = parameter;
	}

	public List<Person> compare(List<Person> persons) {
		switch (parameter) {
		case AGE_ASCENDING:
			System.out.println("---Sorting using Comparator by Age---");
			persons = persons.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
			break;

		case AGE_DESCENDING:
			System.out.println("---Sorting using Comparator by Age with reverse order---");
			persons = persons.stream().sorted(Comparator.comparing(Person::getAge).reversed())
					.collect(Collectors.toList());
			break;

		case NAME_ASCENDING:
			System.out.println("---Sorting using Comparator by Name ---");
			persons = persons.stream().sorted(
					Comparator.comparing(Person::getFirstName, Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER)))
					.collect(Collectors.toList());
			break;

		case NAME_DESCENDING:
			System.out.println("---Sorting using Comparator by Name with reverse order---");
			persons = persons.stream().sorted(Comparator
					.comparing(Person::getFirstName, Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER)).reversed())
					.collect(Collectors.toList());
			break;
		default:
			break;
		}
		return persons;
	}

}