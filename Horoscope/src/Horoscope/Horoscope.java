package Horoscope;

import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String birth,month,day;
	    System.out.println("Enter the your birth gg/aa: ");
		birth=sc.next();
		day=birth.substring(0,2);
		month=birth.substring(3,5);
		FindingHoroscope horoscope=new FindingHoroscope();
		horoscope.printHoroscope(day, month);
	    		
	}
}
class FindingHoroscope
{
	public void printHoroscope(String day,String month)
	{
		int day_=Integer.parseInt(day);
		if(month.equals("01")||month.equals("02")||month.equals("03")||month.equals("04")||
				month.equals("05")||month.equals("06")||month.equals("07")|| month.equals("08")||
				month.equals("09")|| month.equals("10")|| month.equals("11")||month.equals("12") )
		{
		if(month.equals("01"))
		{
			if(day_>1&&day_<31)
			{
				if(day_<22)
				{
					System.out.println("Capricorn");
				}
				else
				{
					System.out.println("Aquarius");
				}
			}else
			{
				System.out.println("invalid day..!");
			}
			
		}
		else if(month.equals("02"))
		{
	    	if(day_>1&&day_<31)
			{
				if(day_<20)
				{
					System.out.println("Aquarius");
				}
				else
				{
					System.out.println("Pisces");
				}
			}
			else
			{
				System.out.println("invalid day..!");
			}
		}
		else if(month.equals("03"))
		{
	    	if(day_>1&&day_<31)
			{
				if(day_<21)
				{
					System.out.println("Pisces");
				}
				else
				{
					System.out.println("Aries");
				}
			}
			else
			{
				System.out.println("invalid day..!");
			}
		}
		else if(month.equals("04"))
		{
	    	if(day_>1&&day_<31)
			{
				if(day_<21)
				{
					System.out.println("Aries");
				}
				else
				{
					System.out.println("Taurus");
				}
			}
			else
			{
				System.out.println("invalid day..!");
			}
		}
		else if(month.equals("05"))
		{
	    	if(day_>1&&day_<31)
			{
				if(day_<22)
				{
					System.out.println("Taurus");
				}
				else
				{
					System.out.println("Gemini");
				}
			}
			else
			{
				System.out.println("invalid day..!");
			}
		}
		else if(month.equals("06"))
		{
	    	if(day_>1&&day_<31)
			{
				if(day_<23)
				{
					System.out.println("Gemini");
				}
				else
				{
					System.out.println("cancer");
				}
			}
			else
			{
				System.out.println("invalid day..!");
			}
		}
		else if(month.equals("07"))
			{
		    	if(day_>1&&day_<31)
				{
					if(day_<23)
					{
						System.out.println("cancer");
					}
					else 
					{
						System.out.println("Lion");
					}
				}
				else
				{
					System.out.println("invalid day..!");
				}
			}
		else if(month.equals("08"))
		{
	    	if(day_>1&&day_<31)
			{
				if(day_<23)
				{
					System.out.println("Lion");
				}
				else
				{
					System.out.println("virgo");
				}
			}
			else
			{
				System.out.println("invalid day..!");
			}
		}
		else if(month.equals("09"))
	 		{
	 	    	if(day_>1&&day_<31)
	 			{
	 				if(day_<23)
	 				{
	 					System.out.println("virgo");
	 				}
	 				else
	 				{
	 					System.out.println("Libra");
	 				}
	 			}
	 			else
	 			{
	 				System.out.println("invalid day..!");
	 			}
	 		}
		else if(month.equals("10"))
 		{
 	    	if(day_>1&&day_<31)
 			{
 				if(day_<23)
 				{
 					System.out.println("Libra");
 				}
 				else
 				{
 					System.out.println("Scorpio");
 				}
 			}
 			else
 			{
 				System.out.println("invalid day..!");
 			}
 		}
		else if(month.equals("11"))
 		{
 	    	if(day_>1&&day_<31)
 			{
 				if(day_<22)
 				{
 					System.out.println("Scorpio");
 				}
 				else
 				{
 					System.out.println("sagittarius");
 				}
 			}
 			else
 			{
 				System.out.println("invalid day..!");
 			}
 		}
		else if(month.equals("12"))
 		{
 	    	if(day_>1&&day_<31)
 			{
 				if(day_<22)
 				{
 					System.out.println("sagittarius");
 				}
 				else
 				{
 					System.out.println("Capricorn");
 				}
 			}
 			else
 			{
 				System.out.println("invalid day..!");
 			}
 		}
	
	}
	else
		{
			System.out.println("invalid month..!");
		}
}
}