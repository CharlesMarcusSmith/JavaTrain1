package com.qa.calculatorexercise;

public class Runner {
	public static void main(String[] args) {
//		Operators Exercises:
		
//		Calculator
		Calculator ca = new Calculator();
//		Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)
		ca.summ(5,3);
//		Create the following additional three methods that each take two parameters:
//		Multiplication - which takes two numbers and returns the product.
//		Subtraction - which takes two numbers, then returns the result of the subtraction.
//		Division - which takes two numbers, then returns the result of the division.
//		Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. Modify the division method so that it takes Double parameters and then return a Double, if not already.
		ca.mult(5, 3);
		ca.subt(5, 3);
		ca.divi(3,  5);
		
//		Results:
		
//		A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
//
//		Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:
//
//		Method 1 - displays the results that the person got for each exam and then the total mark. Try to make the output neat and bespoke for each exam.
		Calculator s1 = new Calculator();
		s1.resultsReceived("Someone", 59, 64, 25);
//		Method 2 - which finds and displays the percentage that the person received for the exams overall.
		s1.resultsPercentage();
		
//		Conditionals Exercises:
		
//		Calculator Revisited
//		Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.

		ca.divi(5, 3);
		
//		Results Revisited
//		Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
//		eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84
//		they would have an overall grade of 85.3% (Pass)
//		but in this case the student would fail because their physics grade is 54% (Fail)
//		Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.
		s1.grade();
		Calculator s2 = new Calculator();
		s2.resultsReceived("Charles", 100, 50, 125); 
		s2.resultsPercentage();
		s2.grade();
	}
	
	
}
