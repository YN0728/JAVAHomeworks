package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class Main {

	public static void main(String[] args) {

		List<String> list = asList("My", "name", "is", "John", "Doe", "bla", "blaaa");
		List<String> list1 = asList("123", "234");
		List<List<String>> listOfLists = Arrays.asList(list, list1);

		Person personAnna = new Person("Anna", 10, "Serbian");
		Person personMary = new Person("Mary", 21, "American");
		Person personJack = new Person("Jack", 17, "American");
		List<Person> people = asList(personAnna, personJack, personMary);

		List<Integer> listOfNumerics = asList(1, 2, 3, 4, 5);

		// 1
		System.out.println(listToUpperCase(list));

		// 2
		System.out.println(elementsWithLessThanFourChars(list));

		// 3
		System.out.println(combineListsIntoOne(listOfLists));

		// 4
		System.out.println("Oldest among all is: " + oldestPerson(people).getName());

		// 5
		System.out.println("Sum of all numbers will be: " + sumOfNumerics(listOfNumerics));

		// 6
		System.out.println(teensUnderEighteen(people));

		// 7
		System.out.println(separateAdultsFromKids(people));

		// 8
		System.out.println(groupByNationality(people));

		// 9
		System.out.println(getAllNames(people));

	}

	public static List<String> listToUpperCase(List<String> list) {
		return list.stream()
			.map(item -> item.toUpperCase())
			.collect(Collectors.toList());
	}

	public static List<String> elementsWithLessThanFourChars(List<String> list) {
		return list.stream()
			.filter(item -> item.length() < 4)
			.collect(Collectors.toList());
	}

	public static List<String> combineListsIntoOne(List<List<String>> listOfLists) {
		return listOfLists.stream()
			.flatMap(l -> l.stream())
			.collect(Collectors.toList());
	}

	public static Person oldestPerson(List<Person> people) {
		return people.stream().reduce(people.get(0), (accumulator, person) -> person.getAge() > accumulator.getAge() ? person : accumulator);
	}

	public static Integer sumOfNumerics(List<Integer> listOfNumerics) {
		return listOfNumerics.stream().reduce(0, (accumulator, item) -> accumulator += item);
	}

	public static List<String> teensUnderEighteen(List<Person> people) {
		return people.stream()
			.filter(person -> person.getAge() < 18)
			.map(person -> person.getName())
			.collect(Collectors.toList());
	}

	public static Map<Boolean, List<Person>> separateAdultsFromKids(List<Person> people) {
		return people.stream().collect(Collectors.groupingBy(it -> it.getAge() > 18));
	}

	public static Map<String, List<Person>> groupByNationality(List<Person> people) {
		return people.stream().collect(Collectors.groupingBy(it -> it.getNationality()));
	}

	public static String getAllNames(List<Person> people) {
		String names = people.stream()
			.map(person -> person.getName())
			.reduce("Names:", (accumulator, name) -> accumulator + " " + name + ",");
		return names.substring(0, names.length() - 1) + ".";
	}
}
