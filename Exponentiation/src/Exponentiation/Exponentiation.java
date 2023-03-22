package Exponentiation;

import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int base,ex;
		System.out.println("enter the base: ");
		base=sc.nextInt();
		System.out.println("Enter the exponent: ");
		ex=sc.nextInt();
		System.out.println("Result: "+exponentiation(base,ex));

	}
	static int exponentiation(int a,int b)
	{
		int result=1;
		for(int i=1;i<=b;i++)
		{
			result*=a;
		}
		return result;
	}
}
