package EBOBEKOK;

import java.util.Scanner;

public class EbobEkokCalculating {

	public static void main(String[] args) {
    
		int number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Number 1: ");
		number1=sc.nextInt();
		System.out.print("Number 2: ");
		number2=sc.nextInt();
		System.out.println("EBOB result is:  "+ebob(number1,number2));
		System.out.println("EKOK result is:  "+ekok(number1,number2));	
	}
	
	static int ebob(int num1,int num2)
	{
		int ebob=1;
		int i=1;
		if(num1<num2)
		{
			while(i<=num1)
			{
				if(num1%i==0&&num2%i==0)
				{
				   ebob=i;
				}
				i++;
			}
		}
		else
		{
			while(i<=num2)
			{
				if(num1%i==0&&num2%i==0)
				{
				   ebob=i;
				}
				i++;
			}
			
		}
		
		return ebob;
	}
	
	static int ekok(int num1,int num2)
	{
		int ekok=1,i=1;
		
		while(i<=num1*num2)
		{
			if(i%num1==0&&i%num2==0)
			{
				ekok=i;
				break;
			}
			i++;
		}
		return ekok;
	}

}
