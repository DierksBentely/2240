// Graham Pomfret
// student ID 0595 995
// this is a program to call a recursive function to display fibbonacci numbers to an nth degree
package fiboRecur;

// importing utilities for Java
// scanner to take user input
// time unit to time how long the program takes
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Ass1 
{
	// main method
	public static void main(String[] args)
	{
		// initializing variable to store start time
		long startTime = System.nanoTime();
		
		// user input
		Scanner userInput = new Scanner(System.in);
		System.out.println("please enter a number to calculate fibbonacci numbers to");
		long userNum = userInput.nextInt();
		
		// printing error message if user's number < 1
		if (userNum < 0)
		{
			System.out.println("cannot calculate fibbonacci numbers to a negative number");
		}

		// loop calling recursive function with i
		for (int i = 0; i<= userNum; i++)
		{
			// recursive method call function
			System.out.println(fiboRecur(i));
		}
		
		// initialize vaiable for end time
		long endTime = System.nanoTime();
		
		System.out.println("Time elapsed was: " + (endTime - startTime) + " nanoseconds");
	}

	public static long fiboRecur(long fiboNum)
	{
		// make 0 = 0, which is the 1st number as a constant
		if (fiboNum < 1)
		{
			return 0;
		}
		// make 1 = 1, second constant
		if (fiboNum == 1 || fiboNum == 2)
			return 1;
		
		// method returns new parameters
		return (fiboRecur(fiboNum-1) + fiboRecur(fiboNum-2));
	}
	
}
