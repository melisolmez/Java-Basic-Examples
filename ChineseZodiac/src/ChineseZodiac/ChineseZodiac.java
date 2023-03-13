package ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int birthyear;
		System.out.println("Enter your birth year: ");
		birthyear=sc.nextInt();
		Zodiac zodiac=new Zodiac();
		zodiac.chineseZodiac(birthyear);
		
	}

}
class Zodiac
{
	public void chineseZodiac(int birthYear)
	{
		if(birthYear%12==0)
		{
			System.out.println("Your Chinese zodiac is monkey :)");
		}
		else if(birthYear%12==1)
		{
			System.out.println("Your Chinese zodiac is cockerel :)");
		}
		else if(birthYear%12==2)
		{
			System.out.println("Your Chinese zodiac is dog :)");
		}
		else if(birthYear%12==3)
		{
			System.out.println("Your Chinese zodiac is pig :)");
		}
		else if(birthYear%12==4)
		{
			System.out.println("Your Chinese zodiac is mouse :)");
		}
		else if(birthYear%12==5)
		{
			System.out.println("Your Chinese zodiac is ox :)");
		}
		else if(birthYear%12==6)
		{
			System.out.println("Your Chinese zodiac is tiger :)");
		}
		else if(birthYear%12==7)
		{
			System.out.println("Your Chinese zodiac is rabbit :)");
		}
		else if(birthYear%12==8)
		{
			System.out.println("Your Chinese zodiac is dragon :)");
		}
		else if(birthYear%12==9)
		{
			System.out.println("Your Chinese zodiac is snake :)");
		}
		else if(birthYear%12==10)
		{
			System.out.println("Your Chinese zodiac is horse :)");
		}
		else if(birthYear%12==11)
		{
			System.out.println("Your Chinese zodiac is sheep :)");
		}
	}
}