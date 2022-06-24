package com.qa.strings;

public class StringManipulation {
//String Manipulation Exercises:	
//	1a: Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
//
//	Concatenate both values, capitalise both strings and print out the result.
//	The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
	public String exerciseOne () {
		String pOne = new String("yesterday was raining");
		String pTwo = new String("today it is sunny");
	    String newP = new String(pTwo.concat(", ").concat(pOne).toUpperCase());
	    return newP;
	}
	
//	1b: Now use the substring method to print out: `TODAY IT IS RAINING`
	public String exerciseOneSub(String inPut) {
//		System.out.println(inPut.indexOf("TODAY"));															//finding out where TODAY starts.
//		System.out.println(inPut.indexOf("RAINING"));														//finding out where raining starts.
		
		String newP = inPut.substring(0, 11).concat(" ").concat(inPut.substring(33,  inPut.length()));
		return newP;
	}
	
//		Method 1 - When given a String, count and return how many words there are in that String.
	public void exerciseTwoA(String inPut) {
		System.out.println(inPut.split(inPut));
	}
//		Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.d

//		Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.

//		Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. 

//		A boolean value should be returned to indicate whether or not the second String has been found in the message.
}
