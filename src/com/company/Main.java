package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// 1
		//		HashSet<String> set = new HashSet<>();
		//		String chessLetters = "abcdefgh";
		//		addElement(set, chessLetters);
		//		set.forEach(item -> System.out.println(item));

		// 2
		//		HashSet<Integer> set = new HashSet<>();
		//		set.add(12);
		//		set.add(33);
		//		Iterator setIterator = iterater(set);
		//		while (setIterator.hasNext()) {
		//			System.out.println(setIterator.next());
		//		}

		// 3
		//		HashSet<String> set = new HashSet<>();
		//		set.add("Name");
		//		set.add("Surname");
		//		System.out.println("Size of set is: " + getSetSize(set));

		// 4
		//		HashSet<String> set = new HashSet<>();
		//		set.add("value 1");
		//		set.add("value 2");
		//		System.out.println("Before clear: ");
		//		set.forEach(item -> System.out.println(item));
		//		emptyHash(set);
		//		System.out.println("After clear: ");
		//		set.forEach(item -> System.out.println(item));

		// 5
		//		HashSet<Integer> set = new HashSet<>();
		//		System.out.println("Fact of set being empty is " + isEmpty(set));

		// 6
		//		HashSet<String> setFrom = new HashSet<>() {{
		//			add("String 1");
		//			add("String 2");
		//		}};
		//		HashSet<String> setToOption1 = cloneSet(setFrom);
		//		HashSet<String> setToOption2 = new HashSet<>();
		//		cloneSet(setFrom, setToOption2);
		//		System.out.println("setToOption1");
		//		setToOption1.forEach(item -> System.out.println(item));
		//		System.out.println("setToOption2");
		//		setToOption2.forEach(item -> System.out.println(item));

		// 7
		//		HashSet<String> set = new HashSet<>();
		//		set.add("String 1");
		//		set.add("String 12");
		//		set.add("String 123");
		//		String[] array = convertSetToArray(set);
		//		for (String element : array) {
		//			System.out.println(element);
		//		}

		// 8
		//		HashSet<Integer> hashSet = new HashSet<>();
		//		hashSet.add(12);
		//		hashSet.add(6);
		//		hashSet.add(1);
		//		hashSet.add(3);
		//		TreeSet<Integer> treeSet = convertHashSetToTreeSet(hashSet);
		//		treeSet.forEach(item -> System.out.println(item));

		// 9
		//		HashSet<String> hashSet = new HashSet<>();
		//		hashSet.add("12");
		//		hashSet.add("6");
		//		hashSet.add("1");
		//		hashSet.add("3");
		//		ArrayList<String> arrayList = convertSetToArraylist(hashSet);
		//		arrayList.forEach(item -> System.out.println(item));

		// 10
		//		HashSet<String> hashSet1 = new HashSet<>();
		//		hashSet1.add("a");
		//		hashSet1.add("b");
		//		HashSet<String> hashSet2 = new HashSet<>();
		//		hashSet2.add("a");
		//		System.out.println("Are sets same? - " + areSetsEqual(hashSet1, hashSet2));

		// 11
//		HashSet<String> hashSet1 = new HashSet<>();
//		hashSet1.add("a");
//		hashSet1.add("b");
//		HashSet<String> hashSet2 = new HashSet<>();
//		hashSet2.add("a");
//		intersectionOfSets(hashSet1, hashSet2);
//		hashSet1.forEach(item -> System.out.println(item));


	}

	public static void addElement(Set set, String string) {
		set.add(string);
	}

	public static Iterator iterater(Set<?> set) {
		return set.iterator();
	}

	public static int getSetSize(Set set) {
		return set.size();
	}

	public static void emptyHash(Set set) {
		set.clear();
	}

	public static boolean isEmpty(Set set) {
		return set.size() == 0;
	}

	public static HashSet<String> cloneSet(Set set) {
		return new HashSet<>(set);
	}

	public static void cloneSet(Set setFrom, Set setTo) {
		setTo.addAll(setFrom);
	}

	public static String[] convertSetToArray(Set set) {
		String[] array = new String[set.size()];
		set.toArray(array);
		return array;
	}

	public static TreeSet convertHashSetToTreeSet(Set hashSet) {
		return new TreeSet(hashSet);
	}

	public static ArrayList convertSetToArraylist(Set hashSet) {
		return new ArrayList(hashSet);
	}

	public static boolean areSetsEqual(Set set1, Set set2) {
		return set1.size() == set2.size() && !set1.retainAll(set2);
	}

	public static Set intersectionOfSets(Set set1, Set set2) {
		set1.retainAll(set2);
		return set1;
	}

}
