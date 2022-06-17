package com.qa.arrays;

import java.util.ArrayList;

public class Runner {
	
	public static String twoDArray[][] = {{"1", "2", "3"},{"A", "B", "C", "D", "E", "F", "G", "H"}};					//Has a length of two, because two values in it.
																														//the first value is which [][] you want to reference, the second value is which value inside the array, so [0][0] is "1", and [1][0] is "A".
	
	public static void main(String[] args) {
//		Exercises
//		1: Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
//		Normal array used for practice:
		
		int[] exVarOne = {1,2,3,4,5,6,7,8,9,10};										//Creating Array with fixed size and values
		
		for(int i=0; i < exVarOne.length; i++) {										//looping through array using the .length feature.
			System.out.println(exVarOne[i]);
		}
		
//		2: Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
//		Variable array list used for practice.
		
		ArrayList<Integer> exVarTwo = new ArrayList<>();								//new array list
		
		for(int i=0; i <10 ; i++) {														//iterating 10 times
			exVarTwo.add(i+1);															//appending the list using the i counter to append 1 to 10, +1 used as count starts from 0, and we need to keep i the same for the below line as arrays start from 0
			System.out.println(exVarTwo.get(i));										//printing the value of this item
		}
		for(int i = 0; i < exVarTwo.size(); i++) {
			exVarTwo.set(i, (exVarTwo.get(i) * 10));									//resetting the value of the array item to that item + 10
			System.out.println(exVarTwo.get(i));
		}
		
//		Practising multi-dimensional arrays:
//		Array created in line 7, so that I can apply different methods to it.
		System.out.println(twoDArray[1][0]);
		
		for (int i = 0; i < twoDArray.length; i++) {
			System.out.println(i);
			System.out.println(twoDArray[i][i]);
		}
		
//		Practicing multi dimensional array lists:
		
//		ArrayExerciseThree.start();
	}
}

