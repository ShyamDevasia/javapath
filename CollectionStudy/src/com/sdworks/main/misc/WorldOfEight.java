package com.sdworks.main.misc;

import java.util.function.Function;

import com.sdworks.main.interfaces.Comparator;

public class WorldOfEight {
	private String[] tabStrings = new String[3];

	public WorldOfEight() {
		
	}
	
	Comparator<Person> compAge = (p1, p2) -> p1.getAge() - p2.getAge();
	Comparator<Person> compName = (p1, p2) -> p1.getName().compareTo(p2.getName());

	Function<Person, Integer> f1 = p -> p.getAge();
	Function<Person, String> f2 = p -> p.getName();

	Comparator<Person> compPersonAge = Comparator.comparing(Person::getAge);
	Comparator<Person> compPersonName = Comparator.comparing(Person::getName);

	//Comparator<Person> cmp = compPersonAge.thenComparing(compPersonName);
	
	Comparator<Person> cmp = Comparator.comparing(Person::getAge).thenComparing(Person::getName);

	/* BinaryOperator<Integer> sum1 =(l1,l2) -> Integer.sum(l1,l2); */
	// BinaryOperator<Integer> sum = Integer::sum;
	/* Function<Person, Integer> f = (person) -> person.getAge(); */

	/*
	 * Runnable r = new Runnable() {
	 * 
	 * @Override public void run() { int i =0; while(i++<10){
	 * System.out.println("It works.."+i); } } };
	 * 
	 * Runnable r = () ->{ int i =0; while(i++<10){
	 * System.out.println("It works.."+i); } };
	 * 
	 */

	/*
	 * Comparator<String> comparator = new Comparator<String>(){ public int
	 * compare(String s1, String s2){ return Integer.compare(s1.length(),
	 * s2.length()); } };
	 */

	/*
	 * Comparator<String> comparator1 = (String s1, String s2) -> {
	 * System.out.println("Comparator running..."); return
	 * Integer.compare(s1.length(), s2.length()); };
	 */

	// Comparator<String> comparator = (String s1, String s2) ->
	// Integer.compare(s1.length(), s2.length());

}
