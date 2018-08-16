package com.saritas.model;

/**
 * @author msaritas
 *
 */
public class Person {

	private Integer age;

	private String firstName;

	protected Person() {
	}

	/**
	 * 
	 * @param age
	 * @param firstName
	 */
	private Person(Integer age, String firstName) {
		this.age = age;
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public static PersonBuilder builder() {
		return new PersonBuilder();
	}

	public static class PersonBuilder {

		private Integer age;

		private String firstName;

		public PersonBuilder setAge(final Integer age) {
			this.age = age;
			return this;
		}

		public PersonBuilder setFirstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Person build() {
			return new Person(age, firstName);
		}

	}

}
