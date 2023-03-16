package DigitSumNumbers;

import java.util.Scanner;

public class DigitSumNumbers {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		System.out.println("the sum of the digits of the number: "+digitSum(number));
		
	}

	public static int digitSum(int number)
	{
		int sum=0;
		
		while(number>=1)
		{
			int kalan=number%10;
			sum+=kalan;
			number/=10;
			
		}
		return sum;
			
	}
}
