package com.qa.printexample;

public class PrintClass {
	public static void main(String[] args) {
//		String result = resultString("Original Value");
//		System.out.println(result);
//		Is the same as:
		System.out.println(resultString("Original Value"));					//we don't need to store the value, but we typically do because its easier to read.
	}
	public static String resultString(String myMessage) {
		return myMessage + " I've added something to this!";
	}
}
