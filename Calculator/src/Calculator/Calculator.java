package Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String shape;
		int number1,number2;
		System.out.println("Enter the numbers and operation: ");
		number1=sc.nextInt();
		shape=sc.next();
		number2=sc.nextInt();
	    switch(shape)
	    {
	    case"+":
	        System.out.println("a+b: "+(number1+number2));
	        break;
	    case"-":
	        System.out.println("a-b: "+(number1-number2));
	        break;
	    case"*":
	        System.out.println("a*b: "+(number1*number2));
	        break;
	    case"/":
	    	System.out.println("a/b: "+(number1/number2));
	    	break;
	    case"%":
	    	System.out.println("a%b: "+(number1%number2));
	    	break;
	    	
	    default:
	    	System.out.println("Invalid operation");
	    	    
	    }	
	}

	
}
