package InvertedTriangle;

import java.util.Scanner;

public class InvertedTriangle {
	public static void main(String[]args)
	{
		int high;
		Scanner sc=new Scanner(System.in);
		System.out.println("High: ");
		high=sc.nextInt();

		for(int i=high;i>=0;i--)
		{
			for(int j=high-i+1;j>0;j-- )
			{
				System.out.print(" ");
			}
			
			for(int k=(i*2)-1;k>0;k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}	
}
