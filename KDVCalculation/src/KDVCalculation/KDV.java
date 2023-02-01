package KDVCalculation;

import java.util.Scanner;

public class KDV {
	
	public static void main(String[]args)
	{
		float money;
		KDVCalculation kdv=new KDVCalculation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money: ");
		money=sc.nextFloat();
		kdv.kdvCalculation(money);
	}

}
