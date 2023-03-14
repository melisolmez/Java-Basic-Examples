package SumNumbers;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
	 
		int number,sumNumbers=0;
		Scanner sc=new Scanner(System.in);
	
		do
		{
			System.out.println("enter the number: ");
			number=sc.nextInt();
			if(number%2==0&&number%4==0)
			{
				sumNumbers+=number;
			}			
		}while(number%2==0);
		
		System.out.println("Sum numbers: "+sumNumbers);
	
}
}