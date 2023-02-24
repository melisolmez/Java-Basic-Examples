package BodyMassİndex;

import java.util.Scanner;

public class BodyMassİndexCalculate {
	public static void main(String[]args)
	{
		float height,kilo;
		Scanner sc=new Scanner(System.in);
		Calculate bodyindex=new Calculate();
		System.out.println("For calculate body mass index enter the kilo and height: ");
		System.out.print("Kilo: ");
		kilo=sc.nextFloat();
		System.out.print("Height: ");
		height=sc.nextFloat();
		System.out.println("Result: "+bodyindex.calculateBodyMassIndex(kilo, height));
	
	}
}
class Calculate
{
	public float calculateBodyMassIndex(float kilo,float height)
	{
		return kilo/(height*height);
	}
}