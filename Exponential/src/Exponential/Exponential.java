package Exponential;

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int base,pow;
		System.out.println("Enter the base of the exponential number: ");
		base=sc.nextInt();
		System.out.println("enter the power of the exponential number:  ");
		pow=sc.nextInt();
		Pow numbers=new Pow();
		System.out.println("Exponential numbers result is: "+numbers.powNumbers(base, pow));
		
	
	}

}
class Pow
{
	public int powNumbers(int base,int pow)
	{
		int result=1;
		for(int i=0;i<pow;i++)
		{
			result*=base;
			
		}
		
		return result;		
	}

}