// Graham Pomfret
// student ID 0595 995 
// this is a program that iterates through a for loop to calculate fibbonacci numbers to nth degree

package fiboIte;
// importing utilities to user
// scanner for user input
// time unit to time the program
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ass1pt2
{
	// main method
	public static void main(String[] args)
	{
		// initialize variable for time storage
		long startTime = System.nanoTime();
		
		// take user input store in variable aptly named userInput
		Scanner userInput = new Scanner(System.in);
		System.out.println("please enter a number to calculate fibbonacci numbers to");
		long userNum = userInput.nextInt();
		
		// make sure user enters positive number
		if (userNum < 0)
		{
			System.out.println("cannot calculate fibonacci numbers to a negative number");
		}
		
		// calling method calcnum, passing 1 int
		calcNum(userNum);
		// initialize variable for end time
		long endTime = System.nanoTime();
		
		System.out.println("Time elapsed was: " + (endTime - startTime) + " nanoseconds");
	}
	
	public static void calcNum(long userNum)
	{
		// creating new variable array to store the values in
		long[] numSeq = new long [100];
		// setting first 2 numbers to 0 and 1 respectively
		numSeq[0]=0;
		numSeq[1]=1;
		// for loop printing out the fibo numbers until reaches userNum +3
		// the reason for + 3 was I had to do a lot of stuff with i +/- numbers to make it work perfectly
		// starts at 2 because 0 = 0 and 1 = 1, which is constant
		for (int i = 2; i < (userNum+3); i++)
		{
			// calculating n = n -1 + n - 2
			// which makes the next number equal to the previous 2 numbers
			numSeq[i] = numSeq[i-1] + numSeq[i-2];
			// prints out the individual numbers starting at -2 because i started at 2
			System.out.println(numSeq[i-2]);			
			
		}
	}
}
