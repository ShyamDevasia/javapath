package com.sdworks.main.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReductionDemo {
	
	public ReductionDemo() {
		
		List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
		List<Integer> ints2 = Arrays.asList(5,6,7,8,9);
		
		//BinaryOperator<Integer> op = (i1, i2) -> i1+i2;
		BinaryOperator<Integer> op = Integer::max;
		
		int reduction1 = reduce(ints1,0,op);
		int reduction2 = reduce(ints2,0,op);
		int reduction = reduce(Arrays.asList(reduction1, reduction2),0,op);
		
		//int reduction = reduce(ints, 0, op);
		System.out.println("Reduction :"+reduction);
	}

	private int reduce(List<Integer> ints, int value, BinaryOperator<Integer> op) {
		
		int result = value;
		for(int i:ints){
			result = op.apply(result, i);
		}
		
		return result;
	}
	
	

}
