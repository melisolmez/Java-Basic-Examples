package ArmstrongNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		
		if(digits(number)==number)
		{
			System.out.println("Armsstrong number");
		}
		else
		{
			System.out.println("Not Armsstrong number");
		}
}

	public static int us(int a,int b)
	{
		int result=1;
		for(int i=0;i<b;i++)
		{
			result*=a;
		}
		return result;
	}
	
	public static int digits(int number)
	{
		int digit,sum=0,tempnumber,count=0;
		tempnumber=number;
		while(tempnumber>=1)
		{
			tempnumber=tempnumber/10;
			count++;
		}
		
		while(number>=1)
		{
			digit =number%10;
			sum+=us(digit,count);
			number/=10;
		}
		return sum;
	}
}

