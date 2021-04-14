package com.deetolondon.test;

import java.util.HashSet;
import java.util.Set;

public class AlgoExpert {
	

	static int [] array = {3,5,-4,8,11,1,-1,6};
	static int target = 5;
	public static void main(String[] args) {
	
	
		printArray(getSum(array, target));
		//printArray(getSumMethod2(array, target));
		

	}
	
	public static int[] getSum( int [] array, int targetsum ) {
		
     for (int num = 0; num < array.length; num ++) {
    	 
    	 int firstNum = array[num];
    	// System.out.print(firstNum +"\n");
    	 
    	 for (int num2 = num+1;  num2 < array.length; num2++) {
    		 
    		 int secondNum= array[num2];
	    	// System.out.print(firstNum +" "+secondNum +"\t");
    		 
    		// System.out.print(firstNum+"\t"+secondNum);	
		     if ((secondNum + firstNum) == target){
		    	 
	
				  
				 return new int [] {firstNum,secondNum}; 
		     }
    		 
    	 }
     } 
    	
    	 
     
		
     return  new int [] {};
		
		
		

	}
	public static int[] getSumMethod2( int [] array, int targetsum ) {
		//create a hash set
		
		 HashSet<Integer> num = new HashSet<>();
		 int potentialmatch;
		 
	     //iterate the array
		 for (int num2 : array) {
			 
			 potentialmatch=targetsum - num2;
			 
			 if (num.contains(potentialmatch)){
				 
				 return new int [] {potentialmatch, num2};
			 }
			 else {
				 num.add(num2);
				 
			 }
			
		}
		
	     
	    	 
	     
			
	     return  new int [] {};
			
			
			

		}
	public static void printArray(int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			
		}
		
		
		
	}

}
