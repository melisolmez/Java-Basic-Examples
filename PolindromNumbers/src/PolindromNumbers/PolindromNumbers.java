package PolindromNumbers;

import java.util.Scanner;

public class PolindromNumbers {

	public static void main(String[] args) {
		
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number: ");
		number=sc.nextInt();
		
		if(isPolindrom(number))
    	{
			System.out.println("The number is polindrom");
		}
		else
		{
			System.out.println("The number is not polindrom");
		}
	}
	
	static boolean isPolindrom(int number)
	{
		int temp=number,reverseNumber=0,mod;
		while(temp!=0)
		{
			mod=temp%10;
			reverseNumber=(reverseNumber*10)+mod;
			temp/=10;
		}
		return number==reverseNumber;
	}
		
		
	
		
		
	}


