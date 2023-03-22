package NumbersPrime;

import java.util.Scanner;

public class NumbersPrime {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(!isPrime(number))
		{
			System.out.println("The number is prime number");
		}
		else
		{
			System.out.println("The number is not prime number");
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
