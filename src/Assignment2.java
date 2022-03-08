//         Name: Jason Younan
//  Description: This class reads an unspecified number of integers from standard input, 
//				 performs some calculations, and outputs the results 

import java.util.Scanner;

public class Assignment2 {
	public static void main(String arg[]) {
		int number; // declaring the integer "number"
		Scanner console = new Scanner(System.in); // creates scanner to grab inputted values

		// initialize variables and set to 0
		int largestint = 0;
		int largestevenint = 0;
		int positiveintcount = 0;
		int sum = 0;

		// check if next variable exists in input stream
		// set number to "nextInt"
		// check if number does not equal 0
		while (console.hasNextInt() && (number = console.nextInt()) != 0) {
			if (number > largestint) // check if inputted value is larger than the current largest integer
			{
				largestint = number; // sets inputted value to largest integer if statement is true
			}

			if (number % 2 == 0 && number > largestevenint) // check if inputted value is even and larger than the
															// current largest even integer
			{
				largestevenint = number; // sets inputted value to largest even integer if statement is true
			}

			if (number > 0) // check to see if inputted value is positive
			{
				positiveintcount++; // add 1 to positive int count
			}

			sum = sum + number; // add inputted value to the sum of all integers
		}

		// print final statements
		System.out.println("The largest integer in the sequence is " + largestint);
		System.out.println("The largest even integer in the sequence is " + largestevenint);
		System.out.println("The count of positive integers in the sequence is " + positiveintcount);
		System.out.println("The sum of all integers is " + sum);

		console.close(); // close input stream
	}
}
