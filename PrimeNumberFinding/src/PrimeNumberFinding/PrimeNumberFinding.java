package PrimeNumberFinding;

import java.util.Scanner;

public class PrimeNumberFinding {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		
		if(!isPrime(number))
		{
			System.out.println("This number is prime number..");
		}
		else
		{
			System.out.println("This number is not prime number..");
		}	
	}
	
	static boolean isPrime(int number)
	{
		boolean check=false;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				check=true;
			}
		}
		return check;
	
	}
}
