package com.learn.educative;

public class CallMeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] data = new int [2][3];
		
		data [0][0]= 1;
		data [0][1]= 2;
		data [0][2]= 3;
		
		data [1][0]= 1;
		data [1][1]= 2;
		data [1][2]= 3;
		
		
		for (int i = 0; i < data.length; i++) {
			
			for (int j = 0; j < data[i].length; j++) {
				System.out.print( "System raw "+data[i][j] +"\t");
				
				
			}
			
		}

	}

}
