package Inclass7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public int getAge() {
		return 5;
	}

	public void printPerson() {
		System.out.println(this.name);
	}

	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person person : roster) {
			if (tester.test(person)) {
				person.printPerson();
			}
		}
	}

	public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> predicate) {
		for (Person person : roster) {
			if (predicate.test(person)) {
				person.printPerson();
			}
		}
	}

	public static void processPersons(List<Person> roster, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : roster) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

	public static void printPersonOlderThan(List<Person> roster, int age) {
		for (Person person : roster) {
			if (person.getAge() >= age) {
				person.printPerson();
			}
		}
	}

	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for (Person person : roster) {
			if (person.getAge() >= low && person.getAge() < high) {
				person.printPerson();
			}
		}
	}

	public static void main() {
		List<Person> roster = new ArrayList<Person>();
		// named class
		printPersons(roster, new CheckPersonEligibleForSelectiveService());
		// anonymous class
		printPersons(roster, new CheckPerson() {
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		});
		// with lambda functional objects
		printPersons(roster, (Person p) -> {
			return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
		});

		printPersonsWithPredicate(roster, (Person p) -> {
			return p.gender == Person.Sex.FEMALE && p.getAge() >= 18;
		});

		processPersons(roster, (p) -> p.gender == Person.Sex.FEMALE && p.getAge() >= 18 && p.getAge() < 24,
				(p) -> p.printPerson());

	}
}