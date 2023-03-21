package RecursiveFibonacci;

import java.util.Scanner;

public class RecursiveFibonacci {
	public static void main(String[]args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		System.out.println(fibonacci(num));
		
	}
	
	static int fibonacci(int number)
	{
		if(number==1||number==2)
		{
			return 1;
		}
		else
		{
			return fibonacci(number-1)+fibonacci(number-2);
		}
	}

}
