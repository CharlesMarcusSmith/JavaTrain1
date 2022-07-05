package com.qa.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



//
//Find the max value.
//Find the min value.
//Remove the odd numbers.
//Remove the even numbers.
//Find the sum of the list.
//Square every number in the list then remove the even numbers and then find the min value.

public class ExStream {																										//cant call a class 'Stream', as this is a class used within Java already.
	public void streamsExercise(){
//		Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".
//		
//		("Michael", "Dean", "James", "Chris")
		
		List<String> names = new ArrayList<>(); 
		names.add("James");
		names.add("Chris");
		names.add("Dean");
		names.add("Michael");
		
		Stream<String> streamOfNames = names.stream();
		
		
		streamOfNames.filter(name -> !names.equals("James")).forEach(name -> System.out.println("Hello" + name));				
	}
	
	
	
		
		
//		Given the following List of Integers, using a stream, have it reduce and print the product (all numbers multiplied together).
//		
//		(3, 4, 7, 8, 12)
//		Starting with a list of numbers, use streams to do the following:		
		
		List<Integer> numbers = List.of(3,4,7,8,12);
		Stream<Integer> streamOfInts = numbers.stream();
		int product = streamOfInts.reduce((num1, num2) -> num1 * num2).get();
		
//		int max = streamOfInts.max(i, j) -> i.compare(j)).get();
//		System.out.println(max);
		
//		OR:
		
		int max = streamOfInts.max(Integer::compare).get();
		
		//-1 if i is larger
		//0 if equal
		//+1 if i is lower
		//compares the two to hold what the highest is
		
//		Max:
		
		//Find the max value.
//		int max = 															//creating a variable to store the result
//				numbers.stream()											//creating the stream
//					.map(x -> a<b)
		
		
					
	
		
}
