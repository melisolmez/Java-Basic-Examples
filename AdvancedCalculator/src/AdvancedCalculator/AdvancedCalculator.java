package AdvancedCalculator;

import java.util.Scanner;

public class AdvancedCalculator {

	public static void main(String[] args) {
		
		show();
		 
	}
	
	static void show()
	{
		 Scanner sc = new Scanner(System.in);
	        int select;
	        String menu = "1- Addition\n"
	                + "2- Extraction process\n"
	                + "3- Multiplication\n"
	                + "4- Division\n"
	                + "5- Exponent Calculation\n"
	                + "6- Factorial Calculation\n"
	                + "7- Mode Retrieval\n"
	                + "8- Rectangular Area and Perimeter Calculation\n"
	                + "0- Exit";

	        do {
	            System.out.println(menu);
	            System.out.print("Please select one process:");
	            select = sc.nextInt();
	            switch (select) {
	                case 1:
	                   System.out.println("Result: "+plus());
	                    break;
	                case 2:
	                	System.out.println("Result: "+minus());  
	                    break;
	                case 3:
	                	System.out.println("Result: "+times());
	                    break;
	                case 4:
	                	System.out.println("Result: "+divided());
	                    break;
	                case 5:
	                	System.out.println("Result: "+power());
	                    break;
	                case 6:
	                	System.out.println("Result: "+factorial());
	                    break;
	                case 7:
	                	System.out.println("Result: "+modding());
	                	break;
	                case 8:
	                	System.out.println("Area Rectangular: "+rectangleArea());
	                	System.out.println("Area Rectangular: "+rectanglePerimeter());
	                  	break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
	            }
	        } while (select != 0);
	}
	
	static int plus()
	{
		Scanner sc=new Scanner(System.in);
		int number,result=0,i=1;
		while(true)
		{
			System.out.println(++i+". number");
			number=sc.nextInt();
			result+=number;
			
			if(number==0)
			{
				break;
			}
			
		}
		return result;		
	}
	
	static int minus()
	{
		Scanner sc=new Scanner(System.in);
		int number,result=0,i=1;
		while(true)
		{
			System.out.println(++i+". number");
			number=sc.nextInt();
			if(i==1)
			{
				result+=number;
			}
			result-=number;
			if(number==0)
			{
				break;
			}
			
		}
		return result;
	}
	
	static int times()
	{
		Scanner sc=new Scanner(System.in);
		int number,result=1,i=1;
		while(true)
		{
			System.out.println(++i+". number");
			number=sc.nextInt();
			result*=number;
			
			if(number==0)
			{
				result=0;
				break;
			}
			
		}
		return result;
	}

	static double divided()
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("How many numbers will you enter:");
	        int counter = sc.nextInt();
	        double number, result = 0.0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". number :");
	            number = sc.nextDouble();
	            if (i != 1 && number == 0) {
	                System.out.println("You cannot enter the divisor 0!");
	                continue;
	            }
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result /= number;
	        }
	        return result;
	}
	static int power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter base value: ");
        int base = scan.nextInt();
        System.out.print("Enter exponent :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

       return result;
    }
	
	static int factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
	static int modding()
	{
		    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the two number :");
	        int n1,n2;
	        n1=sc.nextInt();
	        n2=sc.nextInt();
	        
	        return n1%n2;
	}
	
	static int rectangleArea()
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
        System.out.print("Short edge: ");
        a=sc.nextInt();
        System.out.print("long edge: ");
        b=sc.nextInt();
        
        return a*b;
	}
	
	static int rectanglePerimeter()
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
        System.out.print("Short edge: ");
        a=sc.nextInt();
        System.out.print("long edge: ");
        b=sc.nextInt();
        
        return (a*2)+(b*2);
	}
	
}
