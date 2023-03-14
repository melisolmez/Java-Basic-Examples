package PowersOfNumbers;

import java.util.Scanner;

public class PowersOfNumbers {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		
		for(int i=0;i<number;i++)
		{
			if(i%4==0&&i%5==0)
			{
				System.out.print(i+", ");
			}
		}		
	}

}
