package LeapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter the year:");
		year=sc.nextInt();
		LeapYears leapyear=new LeapYears();
		
		if(leapyear.leapyearFinding(year))
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not leap year");
		}	
	}

}
class LeapYears
{
	public boolean leapyearFinding(int year)
	{
		if(year%100==0)
		{
			if(year%400==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if(year%4==0)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}	
}