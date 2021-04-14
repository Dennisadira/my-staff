package com.deetolondon.test;

import java.util.List;

import java.util.*;

public class Subsequnece {
	
	public static void main (String [] args) {
		
		Integer[] arrays = {4,5,4,9,2,3,42};
		Integer[] subsequence= {4,2,42,3};
		List <Integer> array = new LinkedList <>();
		List<Integer> sequence = new LinkedList <>();
		
		
		for( var Value : arrays)
			array.add(Value);

		for( var Value : subsequence)
			sequence.add(Value);
		
		System.out.print (Subsequnece.isValidSubsequence(array, sequence));
		
	}
	
	//time o(n) space 0(1)
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
	  
	  int sequenceIndex = 0;
	 
	  for (var value : array ) {
		  
		  if (sequenceIndex == sequence.size())
			  break;
		  
		  if(value == sequence.get(sequenceIndex)) {
			  
			  sequenceIndex ++;
			  
		  }
		  
	  }
	  
	  //
     return sequenceIndex == sequence.size();
  }
}