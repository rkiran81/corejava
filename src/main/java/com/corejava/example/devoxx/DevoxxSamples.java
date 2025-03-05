package com.corejava.example.devoxx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DevoxxSamples {

	public static void main(String[] args) {
		Integer age1 = createPeople().stream().map(Person::getAge).reduce(0,(total, age) -> total + age);
		Integer age2 = createPeople().stream().map(Person::getAge).reduce(Integer::sum).get();
		System.out.println(age1+" "+age2);
		System.out.println(createPeople().stream()
										.filter(p -> p.getAge() > 30)
										.map(Person::getName)
										.map(String::toUpperCase)
										.collect(Collectors.toList()));
		
		// works even with parallel stream. above Collectors.toList() does exactly same as reduce below
		List<String> reduce = createPeople().stream()
		.filter(p -> p.getAge() > 30)
		.map(Person::getName)
		.map(String::toUpperCase)
		.reduce(new ArrayList<String>(), 
				(names, name) -> {
					names.add(name);
					return names;
				}, 
				(names1, names2) -> {
					names1.addAll(names2);
					return names1;
				});
		
		System.out.println(createPeople()
				.stream()
				.collect(Collectors
						.toMap(Person::getName, Person::getAge, (t, u) -> u )));// Merge function: keep the second age
		
		System.out.println(createPeople()
				.stream()
				.map(Person::getName)
				.collect(Collectors.joining()));//SaraSaraBobPaulaPaulJackJackJill
		System.out.println(createPeople()
				.stream()
				.map(Person::getName)
				.collect(Collectors.joining("-")));//Sara-Sara-Bob-Paula-Paul-Jack-Jack-Jill
		System.out.println(createPeople()
				.stream()
				.map(Person::getName)
				.collect(Collectors.joining("--", "prefix", "suffix")));//prefixSara--Sara--Bob--Paula--Paul--Jack--Jack--Jillsuffix
		
		System.out.println(createPeople()
				.stream()
				.collect(Collectors.groupingBy(Person::getName)));
		
		//{Bob=[20], Sara=[20, 22], Jill=[11], Jack=[3, 72], Paula=[32], Paul=[32]}
		System.out.println(createPeople()
				.stream()
				.collect(Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toList()))));
		
		//{Bob=1, Sara=2, Jill=1, Jack=2, Paula=1, Paul=1}
		Map<String, Long> collect = createPeople()
				.stream()
				.collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
		
		//{Bob=1, Sara=2, Jill=1, Jack=2, Paula=1, Paul=1}
		Map<String, Integer> collect2 = createPeople()
						.stream()
						.collect(Collectors.groupingBy(Person::getName, 
								Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
		
		
		//{false=[Person(name=Jack, age=3), Person(name=Jill, age=11)], 
		//true=[Person(name=Sara, age=20), Person(name=Sara, age=22), Person(name=Bob, age=20), Person(name=Paula, age=32), Person(name=Paul, age=32), Person(name=Jack, age=72)]}
		System.out.println(createPeople()
				.stream()
				.collect(Collectors.partitioningBy(t -> t.getAge() % 2 == 0)));
		
		System.out.println(createPeople()
				.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Person::getAge))));
		
		System.out.println(createPeople()
				.stream()
				.collect(Collectors
						.collectingAndThen(
								Collectors.maxBy(
										Comparator.comparing(Person::getAge)), person -> person.map(Person::getName).orElse(""))));
	}
	

	public static List<Person> createPeople() {
		return List.of(
				new Person("Sara", 20), 
				new Person("Sara", 22), 
				new Person("Bob", 20), 
				new Person("Paula", 32), 
				new Person("Paul", 32), 
				new Person("Jack", 3), 
				new Person("Jack", 72), 
				new Person("Jill", 11));
	}


}
