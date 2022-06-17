package com.qa.arrays;

import java.util.ArrayList;

public class ArrayExerciseThree {
//	1 Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
//	2 Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//	3 Expand on the method you wrote in step 2 to allow the input 1-999.
//	4 Expand the method you wrote in step 2 to allow the input 1-9999.
//	5 Use a for()-loop to print the numbers 1-100 in words.
//	6 For example; 1 = one, 100 = one hundred.
	
	
//	This exercise has been described as 'obscenely' hard for our level, but here is my plan:
//	1: Append numbers to list.
//	2: Split, by changing from int > string > char > int.
//	^ this might mean we need a multi dimmensional array to store & group the individual chars associated with the number in question
//	3: Assess; if statements to work out hundreds, tens and units in that order.
//	done in this order ^ so we can pick out 10 - 19 as anomalies for every hundred and seperate their functionality before progressing.
//	4: Naming allocation, converting the char in question to its associated word, frankly this part is easy.
//	5: Regroup words in print function, easiest part
//	Note: this should all be done in individual methods to prevent re-writing code, and stored in a class specific array.
//	Note: A multi-dimensional array list would work as such List<number in question <complete string representation, units, tens, hundreds>> 
//	^ we will do this with string at the front as we can give it a void value to begin, and it means we know exactly where in the list it is regardless of the amount of digits
//	^ if we did it at the end, we would be locked to the digit amount,
//	^ this avoidance of locking the digits we can have is the reason we have done the digits in unit, tens, hundreds
//	^ means we can add hundreds by just adding an extra item to the list if we want to, and if for 1 - 99, we can just allocate 0.
//	^ may be a bit disgusting to do, but if the functionality works, it means we can keep adding digits, so in theory thousands, tens of thousands etc wouldn't be a problem
//	^ this future proofs the solution for scalability.
	
// May be easier to use seperate arrays instead of a multi-dimmensional array.
// Arrays for units, tens, and hundreds; and all numbers are a combination of these
// simpler solution as we can then refer to the value for each, so 600 would be [5] inside the hundreds list
// could just code both for fun tho
	
	
	ArrayList<Integer> exVarThree = new ArrayList<>();			//new class specific array list
	
	public void start(){
		//here we are going to be calling the functions
		
		
	}
}
