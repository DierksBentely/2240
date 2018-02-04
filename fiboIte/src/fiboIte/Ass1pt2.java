package fiboIte;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ass1pt2
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
		
		calcNum(userNum);
		long endTime = System.nanoTime();
		
		System.out.println("Time elapsed was: " + (endTime - startTime) + " nanoseconds");
	}
	
	public static void calcNum(int userNum)
	{
		int[] numSeq = new int [100];
		numSeq[0]=0;
		numSeq[1]=1;
		for (int i = 2; i < userNum; i++)
		{
			numSeq[i] = numSeq[i-1] + numSeq[i-2];
			System.out.println(numSeq[i-2]);			
			
		}
	}
}
