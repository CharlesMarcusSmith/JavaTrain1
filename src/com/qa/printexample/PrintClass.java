package com.qa.printexample;

public class PrintClass {
	public static void main(String[] args) {
//		String result = resultString("Original Value");
//		System.out.println(result);
//		Is the same as:
		System.out.println(resultString("Original Value"));					//we don't need to store the value, but we typically do because its easier to read.
		
		
		System.out.println(floatExample());
		System.out.println(compareNumbers());
	}
	public static String resultString(String myMessage) {
		return myMessage + " I've added something to this!";
	}
	
	public static float floatExample() {
		return  7f / 2f;													//we have to put f after the numbers, because Java automatically truncates int division (rounds it)
																			//so even 7 / 2, returned then saved as a float, will equal 3.0
																			//we have to make the numbers floats before we divide them therefore.
	}
	public static boolean compareNumbers() {								//the following code compares two numbers then returns a boolean
		boolean equal = false;
		if (2 == 2) {
			equal = true;
		}
		return equal; 
	}
	
}
