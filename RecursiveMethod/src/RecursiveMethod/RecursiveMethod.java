package RecursiveMethod;

import java.util.Scanner;

public class RecursiveMethod {

	public static int num;
	public static int temp;
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		try {
			num=sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		temp=num;
		method(num);
	
	}
	
	static int method(int number)
	{
	     System.out.println(number); 
	     if(number>0)
	     {
	    	 return method(number-5);
	     }
	     else if(number==0||number<0)
	     {
	    	 return method2(number+5);
	     }
	     else
	     {
	    	 return 0;
	     }
	}
	static int method2(int number)
	{
		System.out.println(number);
		if(temp!=num)
		{
			return method2(number+5);
		}
		else
		{
			System.out.println(num);
			return 0;
		}
		
	}

}
