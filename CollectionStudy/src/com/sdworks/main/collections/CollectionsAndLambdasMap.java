package com.sdworks.main.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sdworks.main.misc.City;
import com.sdworks.main.misc.Person;

public class CollectionsAndLambdasMap {

	public CollectionsAndLambdasMap() {
		Person p1 = new Person("Alexi", 23);
		Person p2 = new Person("Brian", 56);
		Person p3 = new Person("Chelsea", 46);
		Person p4 = new Person("David", 28);
		Person p5 = new Person("Erica", 37);
		Person p6 = new Person("Fransisco", 18);

		City newYork = new City("New York");
		City shanghai = new City("Shanghai");
		City paris = new City("paris");

		Map<City, List<Person>> map = new HashMap<>();

		map.putIfAbsent(paris, new ArrayList<>());
		map.get(paris).add(p1);

		Map<City, List<Person>> map1 = new HashMap<>();
		map1.computeIfAbsent(newYork, c -> new ArrayList<>()).add(p1);
		map1.computeIfAbsent(shanghai, c -> new ArrayList<>()).add(p2);
		map1.computeIfAbsent(shanghai, c -> new ArrayList<>()).add(p3);
		System.out.println("--Map1--");
		map1.forEach((k, v) -> System.out.println("City: " + k + " people" + v));

		Map<City, List<Person>> map2 = new HashMap<>();
		map2.computeIfAbsent(shanghai, c -> new ArrayList<>()).add(p4);
		map2.computeIfAbsent(paris, c -> new ArrayList<>()).add(p4);
		map2.computeIfAbsent(paris, c -> new ArrayList<>()).add(p5);

		System.out.println("--Map2--");
		map2.forEach((k, v) -> System.out.println("City: " + k + " people" + v));

		map2.forEach((city, people) -> map1.merge(city, people, (peopleFromMap1, peopleFromMap2) -> {
			peopleFromMap1.addAll(peopleFromMap2);
			return peopleFromMap1;
		}));
		
		System.out.println("--Map1 & Map2 merged--");
		map1.forEach((k, v) -> System.out.println("City: " + k + " people" + v));

	}

}
