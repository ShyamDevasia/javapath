package com.sdworks.main.old.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public SetDemo() {
		/**
		 * Set is an interface which extends Collection. It is an unordered
		 * collection of objects in which duplicate values cannot be stored.
		 */
		Set<String> hs = new HashSet<String>();

		hs.add("I");
		hs.add("want");
		hs.add("to");
		hs.add("code");
		hs.add("code");
		hs.add("every day");

		System.out.println(hs);

		System.out.println("sorted set after passing to treeset");
		Set<String> ts = new TreeSet<String>(hs);
		System.out.println(ts);

		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] { 1, 2, 3 }));
		System.out.println(a);
		/**
		 * union.addAll(b); intersection.retainAll(b); difference.removeAll(b);
		 */

		/**
		 * HASHSET The initial capacity means the number of buckets when
		 * hashtable (HashSet internally uses hashtable data structure) is
		 * created. Number of buckets will be automatically increased if the
		 * current size gets full. The load factor is a measure of how full the
		 * HashSet is allowed to get before its capacity is automatically
		 * increased. When the number of entries in the hash table exceeds the
		 * product of the load factor and the current capacity, the hash table
		 * is rehashed (that is, internal data structures are rebuilt) so that
		 * the hash table has approximately twice the number of buckets.
		 */

		Set<Integer> hs1 = new HashSet<Integer>();
		hs1.addAll(Arrays.asList(new Integer[] { 1, 2, 3 }));
		System.out.println("conatins: " + hs1.contains(1));
		hs1.clear();
		System.out.println("after clear: " + hs1);

		/**
		 * public boolean add(E e) { return map.put(e, PRESENT) == null; }
		 */
	}
}
