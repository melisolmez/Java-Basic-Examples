package MinMaxValues;

import java.util.Scanner;

public class MinMaxValues {
	public static void main(String[]args)
	{
		int num1,num2,num3,num4;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the four numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		
        sorting(num1,num2,num3,num4);	
	}
	
   static void sorting(int num1,int num2,int num3,int num4)
   {
	   int smallest=0,largest=0;
	   if(num1<num2&&num1<num3&&num1<num4) 
	   {
		   System.out.print(num1+"<");
		   smallest=num1;
		   if(num2<num3&&num2<num4)
		   {
			   System.out.print(num2+"<");
			   if(num3<num4)
			   {
				   System.out.print(num3+"<"+num4);
				   largest=num4;
			   }else
			   {
				   System.out.print(num4+"<"+num3);
				   largest=num3;
			   }
		   }		     
		   else if(num3<num2&&num3<num4)
		   {
			   System.out.print(num3+"<");
			   if(num2<num4)
			   {
				   System.out.print(num2+"<"+num4);
				   largest=num4;
			   }else
			   {
				   System.out.print(num4+"<"+num2);
				   largest=num2;
			   }
		   }
		   else if(num4<num2&&num4<num3)
		   {
			   System.out.print(num4+"<");
			   if(num2<num3)
			   {
				   System.out.print(num2+"<"+num3);
				   largest=num3;
			   }
			   else
			   {
				   System.out.print(num3+"<"+num2);
				   largest=num2;
			   }
		   }	  
	   }
	    if(num2<num1&&num2<num3&&num2<num4)
	   {
		   System.out.print(num2+"<");
		   smallest=num2;
		   if(num1<num3&&num1<num4) 
		   {
			   System.out.println(num1+"<");
			   if(num3<num4)
			   {
				   System.out.print(num3+"<"+num4);
				   largest=num4;
			   }
			   else
			   {
				   System.out.print(num4+"<"+num3);
				   largest=num3;
			   }
		   }
		   else if(num3<num1&&num3<num4)
		   {
			   System.out.println(num3+"<");
			   if(num1<num4)
			   {
				   System.out.print(num1+"<"+num4);
				   largest=num4;
			   }
			   else
			   {
				   System.out.print(num4+"<"+num1);
				   largest=num1;		   
			   }
		   }
		   else if(num4<num3&&num4<num1)
		   {
			   System.out.println(num4+"<");
			   if(num3<num1)
			   {
				   System.out.print(num3+"<"+num1);
				   largest=num1;
			   }
			   else
			   {
				   System.out.print(num1+"<"+num3);
				   largest=num3;
			   }
		   }		   
	   }
	   if(num3<num1&&num3<num2&&num3<num4) 
	   {
		   System.out.print(num3+"<");
		   smallest=num3;
		   if(num2<num1&&num2<num4) 
		   {
			   System.out.print(num2+"<");
			   if(num1<num4)
			   {
				   System.out.print(num1+"<"+num4);
				   largest=num4;
			   }
			   else
			   {
				   System.out.print(num4+"<"+num1);
				   largest=num1;
			   }
		   }
		   else if(num1<num2&&num1<num4) 
		   {
			   System.out.print(num1+"<");
			   if(num2<num4)
			   {
				   System.out.print(num2+"<"+num4);
				   largest=num4;
			   }
			   else
			   {
				   System.out.print(num4+"<"+num2);
				   largest=num2;
			   }
		   }
		   else if(num4<num1&&num4<num2)
		   {
			   System.out.print(num4+"<");
			   if(num1<num2)
			   {
				   System.out.print(num1+"<"+num2);
				   largest=num2;
			   }
			   else
			   {
				   System.out.print(num2+"<"+num1);
				   largest=num1;
			   }	
		   }	   	   
	   }
	   if(num4<num1&&num4<num2&&num4<num3)
	   {
		   System.out.print(num4+"<");
		   smallest=num4;
		   if(num2<num1&&num2<num3) 
		   {
			   System.out.print(num2+"<");
			   if(num1<num3)
			   {
				   System.out.print(num1+"<"+num3);
				   largest=num3;
			   }
			   else
			   {
				   System.out.print(num3+"<"+num1);
				   largest=num1;
			   }
		   }
		   else if(num1<num2&&num1<num3)
		   {
			   System.out.print(num1+"<");
			   if(num2<num3)
			   {
				   System.out.print(num2+"<"+num3);
				   largest=num3;
			   }
			   else
			   {
				   System.out.print(num3+"<"+num2);
				   largest=num2;
			   }
		   }else if(num3<num1&&num3<num2)
		   {
			   System.out.print(num3+"<");
			   if(num2<num1)
			   {
				   System.out.print(num2+"<"+num1);
				   largest=num1;
			   }
			   else
			   {
				   System.out.print(num1+"<"+num2);
				   largest=num2;
			   }
		   }
	   }
	   System.out.println(" ");
	   
	   System.out.println("The smallest number is: "+smallest);
	   System.out.println("The largest number is: "+largest);
	   
   }

	
}
