package HarmonicSeries;

import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double number,result=0;
		System.out.println("Enter the number: ");
		number=sc.nextDouble();
		
		while(number>0)
		{
			result+=(1/number);
			number--;		
		}
		System.out.println("Harmonic series: "+result);
		
	}

}
