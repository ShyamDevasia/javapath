package com.sdworks.main.old.collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo {

	public QueueDemo() {
		Deque dqu = new LinkedList<>();
		
		dqu.add("1st element");
		dqu.add("2nd element");
		dqu.add("last element");
		dqu.push("Head element");
		dqu.offer("tail element");
		dqu.offerFirst("new head element");
		dqu.offerLast("new tail element");
			
		Iterator itr = dqu.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("pop: "+dqu.pop());
		
		System.out.println("In reverse order...");
		Iterator dItr = dqu.descendingIterator();
		while(dItr.hasNext()){
			System.out.println(dItr.next());
		}
	}
}
