package AvarageNumbers;

import java.util.Scanner;

public class AvarageNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number,avarage=0,sumNumbers=0,countNumbers=0;
		System.out.println("Enter the number for finding even numbers:");
		number=sc.nextInt();
		
		for(int i=1;i<number;i++) {
			if(i%3==0&&i%4==0)
			{
				sumNumbers+=i;
				countNumbers++;
			
			}
		}
		avarage=sumNumbers/countNumbers;
		System.out.println("Avarage= "+avarage);

	}

}
