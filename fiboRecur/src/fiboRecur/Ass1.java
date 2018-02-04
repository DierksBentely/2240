package fiboRecur;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Ass1 
{
	public static void main(String[] args)
	{
		long startTime = System.nanoTime();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("please enter a number to calculate fibbonacci numbers to");
		int userNum = userInput.nextInt();
		
		if (userNum < 0)
		{
			userNum = 0;
			
		}
		
		for (int i = 0; i<= userNum; i++)
		{
			System.out.println(fiboRecur(i));
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("Time elapsed was: " + (endTime - startTime) + " nanoseconds");
	}

	public static int fiboRecur(int fiboNum)
	{
		if (fiboNum < 1)
		{
			return 0;
		}
		if (fiboNum == 1 || fiboNum == 2)
			return 1;
		
		return fiboRecur(fiboNum-1) + fiboRecur(fiboNum-2);
	}
	
}
