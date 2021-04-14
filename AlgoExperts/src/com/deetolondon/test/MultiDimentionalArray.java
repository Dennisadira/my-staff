package com.deetolondon.test;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] sampleMDA= {{2,4,3,5,2},{4,67,3,5,6,3},{5,6,3,6,6}};
		printMDA(sampleMDA);

	}

	
	public static void printMDA(int [][] mda) {
		
		for (int column =0; column<mda.length; column++) {
			
			for (int raw =0; raw< mda[column].length; raw ++) {
				
				System.out.print( mda[column][raw] +"\t");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}
}
