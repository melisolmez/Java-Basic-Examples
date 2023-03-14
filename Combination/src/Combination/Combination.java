package Combination;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n,r,combination;
		System.out.println("Enter the N: ");
		n=sc.nextInt();
		System.out.println("Enter the R: ");
		r=sc.nextInt();
		Factorial number=new Factorial();
		combination=(number.factorial(n))/(number.factorial(r)*(number.factorial(n-r)));
		System.out.println("Combination result is: "+combination);

	}

}
class Factorial
{
	public int factorial(int number)
	{
		int result=1;
		for(int i=1;i<=number;i++)
		{
			result*=i;
			
		}
			
		return result;
	}	
}