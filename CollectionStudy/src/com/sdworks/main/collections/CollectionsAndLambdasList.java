package com.sdworks.main.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.sdworks.main.misc.Person;

public class CollectionsAndLambdasList {
	
	public CollectionsAndLambdasList() {
		Person p1 = new Person("Alexi", 23);
		Person p2 = new Person("Brian", 56);
		Person p3 = new Person("Chelsea", 46);
		Person p4 = new Person("David", 28);
		Person p5 = new Person("Erica", 37);
		Person p6 = new Person("Fransisco", 18);
		
		List<Person> people = new ArrayList(Arrays.asList(p1,p2,p3,p4,p5,p6));
		people.forEach(System.out::println);
		
		System.out.println("--removeIf < 30");
		people.removeIf(p -> p.getAge() < 30);
		people.forEach(System.out::println);
		
		System.out.println("--replaceAll");
		people.replaceAll(p -> new Person(p.getName().toUpperCase(), p.getAge()));
		people.forEach(System.out::println);
		
		System.out.println("--sort");
		people.sort(Comparator.comparing(Person::getAge).reversed());
		people.forEach(System.out::println);
	}

}
