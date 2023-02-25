package NumbersToSort;

import java.util.Scanner;

public class NumbersToSort {

	public static void main(String[] args) {
	
		int number1,number2,number3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		
		number1=sc.nextInt();
		number2=sc.nextInt();
		number3=sc.nextInt();
		
		if(number1<number2&&number1<number3)
		{
			System.out.print(number1+"<");
			if(number2<number3)
			{
				System.out.print(number2+"<"+number3);
			}
			else
			{
				System.out.print(number3+"<"+number2);
			}
		}
		else if(number2<number1&&number2<number3)
		{
			System.out.print(number2+"<");
			if(number1<number3)
			{
				System.out.print(number1+"<"+number3);
			}
			else
			{
				System.out.print(number3+"<"+number1);
			}
		}
		else if(number3<number1&&number3<number2)
		{
			System.out.print(number3+"<");
			if(number1<number2)
			{
				System.out.print(number1+"<"+number2);
			}
			else
			{
				System.out.print(number2+"<"+number1);
			}
			
		}
		

	}

}
