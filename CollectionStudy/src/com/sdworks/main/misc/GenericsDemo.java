package com.sdworks.main.misc;

/**
 * We can also pass multiple Type parameters in Generic classes.
 */
class Test<T> {
	T obj;

	Test(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return obj;
	}
	
	static <T> void genericFunction(T val){
		System.out.println(val.getClass().getName()+" "+val);
	}
}

public class GenericsDemo {
	public GenericsDemo() {

		/**
		 * To create an instance of generic class BaseType <Type> obj = new
		 * BaseType <Type>() Note: In Parameter type we can not use primitives
		 * like 'int','char' or 'double'
		 */

		Test<Integer> test = new Test<Integer>(15);
		System.out.println(test.getObject());
		
		Test.genericFunction(11);
		Test.genericFunction("I like to code every day");

	}
}
