package DiamondWithStars;

import java.util.Scanner;

public class DiamondWithStars {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int number;
		number=sc.nextInt();
		
		for(int i=0;i<=number;i++)
		{
			for(int j=0;j<(number-i);j++ )
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=(2*i+1);k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int i=number;i>0;i--)
		{
			for(int j=number-i+1;j>0;j-- )
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
