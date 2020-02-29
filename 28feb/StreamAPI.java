package com.cognizant.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		addNames(names);
		// 1. Print names with length more than six
		List<String> namesWithList = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		namesWithList.forEach(System.out::println);
		// System.out.println(namesWithList);
		// 2. Print names in uppercase
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Names in uppercase");
		System.out.println();
		namesInUpper.forEach(System.out::println);
		long count = names.stream().count();
		System.out.println("List count is  " + count);
		Stream<Integer> data = Stream.of(1, 11, 111, 1111);
		System.out.println("Data count is = " + data.count());
		Stream<String> languages = Stream.of("c", "c++", "java", "Python", "angular");
		Stream<String> language = Stream.of("c", "c++", "java", "Python", "angular");
		List<String> abcd = languages.filter(s -> s.length() > 4).collect(Collectors.toList());
		System.out.println(abcd);
		List<String> bcd = language.map(s -> s.concat("  	programmming")).collect(Collectors.toList());
		System.out.println(bcd);
		// sort the list
		List<String> defaultsorted = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Default sorting ");
		System.out.println(defaultsorted);
		List<String> customsorting = names.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(customsorting);
	}

	private static void addNames(ArrayList<String> names) {
		names.add("Niraj");
		names.add("harshita");
		names.add("Rajshree");
		names.add("Pulkit");
		names.add("Abhishek");
		names.add("Mayuresh");
	}

}
