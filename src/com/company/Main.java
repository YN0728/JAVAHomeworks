package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

		// 12
		//		HashSet<String> hashSet = new HashSet<>();
		//		hashSet.add("string 1");
		//		hashSet.add("string 2");
		//		System.out.println("Elements before removal");
		//		hashSet.forEach(item -> System.out.println(item));
		//		removeAllElement(hashSet);
		//		System.out.println("Elements after removal");
		//		hashSet.forEach(item -> System.out.println(item));

		// 13
		//		Map<String, Integer> hashMap = new HashMap<>();
		//		addKeyValue(hashMap, "key", 111);

		// 14
		//		Map<String, Integer> hashMap = new HashMap<>();
		//		addKeyValue(hashMap, "key1", 111);
		//		addKeyValue(hashMap, "key2", 222);
		//		System.out.println("Size of map will be " + getMapSize(hashMap));

		// 15
		//		Map<String, Integer> hashMap1 = new HashMap<>();
		//		addKeyValue(hashMap1, "key1", 111);
		//		addKeyValue(hashMap1, "key2", 222);
		//		Map<String, Integer> hashMap2 = new HashMap<>();
		//		copyMapToGivenMap(hashMap1, hashMap2);
		//		for (Map.Entry entry : hashMap2.entrySet()) {
		//			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		//		}

		// 16
		//		Map<String, Integer> hashMap = new HashMap<>();
		//		addKeyValue(hashMap, "key1", 111);
		//		addKeyValue(hashMap, "key2", 222);
		//		removeAllElementFromMap(hashMap);

		// 17
		//		Map<String, Integer> hashMap = new HashMap<>();
		//		addKeyValue(hashMap, "key1", 111);
		//		addKeyValue(hashMap, "key2", 2222);
		//		System.out.println(isElementInMap(hashMap, "key1", 111));
		//		System.out.println(isElementInMap(hashMap, "key1", 222));

		// 18
		//		Map<String, String> hashMap = new HashMap<>() {{
		//			put("key1", "value1");
		//			put("key2", "value2");
		//		}};
		//		Map<String, String> copyOfHashMap = shallowCopyOfMap(hashMap);
		//		for (Map.Entry item : copyOfHashMap.entrySet()) {
		//			System.out.println(item.getKey() + " " + item.getValue());
		//		}

		// 19
		//		Map<String, String> hashMap = new HashMap<>() {{
		//			put("key1", "value1");
		//			put("key2", "value2");
		//		}};
		//		int a = 111;
		//		System.out.println(isKeyInMap(hashMap, a));

		// 20
		//		Map<String, String> hashMap = new HashMap<>() {{
		//			put("key1", "value1");
		//			put("key2", "value2");
		//		}};
		//		System.out.println(isValueInMap(hashMap, "value1"));

		// 21
		//		Map<String, String> hashMap = new HashMap<>() {{
		//			put("key1", "value1");
		//			put("key2", "value2");
		//		}};
		//		System.out.println(createSetFromMap(hashMap));

		// 22
		//		Map<String, String> hashMap = new HashMap<>() {{
		//			put("key1", "value1");
		//			put("key2", "value2");
		//		}};
		//		System.out.println(getValueFromKey(hashMap, "key1"));

		// 23
		//		Map<String, Integer> hashMap = new HashMap<>() {{
		//			put("key1", 111);
		//			put("key2", 222);
		//		}};
		//		System.out.println(createSetFromMapKeys(hashMap));

		// 24
		Map<String, Integer> hashMap = new HashMap<>() {{
			put("key1", 111);
			put("key2", 222);
		}};
		System.out.println(createListFromMapValue(hashMap));


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

	public static void removeAllElementFromSet(Set set) {
		set.removeAll(set);
	}

	public static void addKeyValue(Map map, String key, Integer value) {
		map.put(key, value);
	}

	public static int getMapSize(Map map) {
		return map.size();
	}

	public static void copyMapToGivenMap(Map fromMap, Map toMap) {
		toMap.putAll(fromMap);
	}

	public static void removeAllElementFromMap(Map map) {
		map.clear();
	}

	public static boolean isElementInMap(Map map, String key, Integer value) {
		return map.containsKey(key) && map.get(key) == value;
	}

	public static Map shallowCopyOfMap(Map map) {
		return new HashMap(map);
	}

	public static boolean isKeyInMap(Map map, Object key) {
		return map.containsKey(key);
	}

	public static boolean isValueInMap(Map map, Object value) {
		return map.containsValue(value);
	}

	public static Set createSetFromMap(Map map) {
		return new HashSet(map.entrySet());
	}

	public static Object getValueFromKey(Map map, Object key) {
		return map.get(key);
	}

	public static Set createSetFromMapKeys(Map map) {
		return new HashSet(map.keySet());
	}

	public static List createListFromMapValue(Map map) {
		return new ArrayList(map.values());
	}


}
