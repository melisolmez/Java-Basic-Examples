package PassTheClass;

import java.util.Scanner;

public class PassTheClass {

	public static void main(String[] args) {
		
		int mat,phy,tur,chem,muz;
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter the math note:");
		mat=sc.nextInt();
		
		System.out.println("Enter the physical note:");
		phy=sc.nextInt();
		
		System.out.println("Enter the turkish note:");
		tur=sc.nextInt();
		
		System.out.println("Enter the chemical note:");
		chem=sc.nextInt();
		
		System.out.println("Enter the muzik note:");
		muz=sc.nextInt();
		
	   double avarage=(mat+phy+tur+chem+muz)/5;
		
		if(avarage>55)
		{
			System.out.println("Congratulations.. Pass the class");
		}
		else
		{
			System.out.println("Unfortunately.. Don't Pass the class");
		}
	
	}

}
