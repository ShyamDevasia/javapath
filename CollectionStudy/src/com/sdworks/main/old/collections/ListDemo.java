package com.sdworks.main.old.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {

	public ListDemo() {

		/**
		 * boolean hasNext(): This method returns true if the iterator has more
		 * elements. elements next(): This method returns the next elements in
		 * the iterator. void remove(): This method removes from the collection
		 * the last elements returned by the iterator.
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			al.add(i);
		}
		/**
		 * Iterator and for-each loop are faster than simple for loop for
		 * collections with no random access, while in collections which allows
		 * random access there is no performance change with for-each loop/for
		 * loop/iterator.
		 */
		ListIterator itr = al.listIterator();
		while (itr.hasNext()) {
			System.out.println("nextindex: " + itr.nextIndex());
			System.out.println("previousindex: " + itr.previousIndex());
			System.out.println("elemnts: " + itr.next());
		}
		for (int a : al) {
			System.out.println("for each : " + a);
		}

		/**
		 * void add(int index,Object O): This method adds given element at
		 * specified index. boolean addAll(int index, Collection c): This method
		 * adds all elements from specified collection to list. First element
		 * gets inserted at given index. If there is already an element at that
		 * position, that element and other subsequent elements(if any) are
		 * shifted to the right by increasing their index.
		 */

		ArrayList<String> sa = new ArrayList<String>();
		sa.addAll(Arrays.asList(new String[] { "I", "Like", "To", "Code", "Code", "All", "Day" }));
		System.out.println(sa);
		System.out.println("first index of Geeks:" + sa.indexOf("Code"));
		System.out.println("last index of Geeks:" + sa.lastIndexOf("Code"));
	
		/**
		 * List subList(int fromIndex,int toIndex):This method returns List view of
		 * specified List between fromIndex(inclusive) and toIndex(exclusive).
		 */
		ArrayList <String> sublist = new ArrayList<String>(sa.subList(1, 3));
		System.out.println(sublist);
		
		/**
		 * LINKED LIST
		 * */
		System.out.println("***LINKED LIST***");
		LinkedList<String> llist = new LinkedList<String>();
		llist.addAll(Arrays.asList(new String[]{ "I", "Like", "To", "All", "Day" }));
		llist.add(3, "Code");
		System.out.println(llist);
	}
	
	
}
