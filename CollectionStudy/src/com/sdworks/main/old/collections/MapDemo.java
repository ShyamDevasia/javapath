package com.sdworks.main.old.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public MapDemo() {
		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			Integer c = hmap.get(arr[i]);

			// If this is first occurrence of element
			if (hmap.get(arr[i]) == null)
				hmap.put(arr[i], 1);

			// If elements already exists in hash map
			else
				hmap.put(arr[i], ++c);
		}

		// Print result
		for (Map.Entry m : hmap.entrySet()){
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
		}
		
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		
		tm.put(3, 33);
		tm.put(2, 22);
		tm.put(0, 1);
		tm.put(1, 0);
		
		System.out.println(tm);
		
	}
}
