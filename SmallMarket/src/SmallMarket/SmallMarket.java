package SmallMarket;

import java.util.Scanner;

public class SmallMarket {
	public static void main(String[]args)
	{
		float pear,apple,tomate,banana,aubergine,totalPrice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Melis market:) \n what do you want?");
		System.out.println("How much do you want pear(kg)?: ");
		pear=sc.nextFloat();
		totalPrice+=pear*2.14;
		System.out.println("How much do you want apple(kg)?: ");
		apple=sc.nextFloat();
		totalPrice+=apple*3.67;
		System.out.println("How much do you want tomate(kg)?: ");
		tomate=sc.nextFloat();
		totalPrice+=tomate*1.11;
		System.out.println("How much do you want banana(kg)?: ");
		banana=sc.nextFloat();
		totalPrice+=banana*0.95;
		System.out.println("How much do you want aubergine(kg)?: ");
		aubergine=sc.nextFloat();
		totalPrice+=aubergine*5.00;
		System.out.println("Total Price: "+totalPrice);		
	}
}
