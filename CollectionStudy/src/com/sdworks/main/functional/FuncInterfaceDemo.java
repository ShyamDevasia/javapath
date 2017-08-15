package com.sdworks.main.functional;

import com.sdworks.main.interfaces.Predicate;

public class FuncInterfaceDemo {

	Predicate<String> p1 = s -> s.length() < 20;
	Predicate<String> p2 = s -> s.length() > 5;

	Predicate<String> p3 = p1.and(p2);
	Predicate<String> p4 = p1.or(p2);
	Predicate<String> p5 = Predicate.isEqualsTo("TEST");
	Predicate<Integer> p6 = Predicate.isEqualsTo(1);
	
	public FuncInterfaceDemo() {
		System.out.println(p1.test("Hello!!"));
		System.out.println(p3.test("boy"));
		System.out.println(p4.test("Gentleman..."));
		System.out.println(p5.test("Gentleman..."));
		System.out.println(p5.test("TEST"));
	}
}
