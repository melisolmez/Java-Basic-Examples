package SeasonActivity;

import java.util.Scanner;

public class SeasonActivity {

	public static void main(String[] args) {
		
		int heat;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the heat weather: ");
		heat=sc.nextInt();
		
		if(heat>25)
		{
			System.out.println("you can got to the sea and you swim... :)");
		}
		else if(heat>15&&heat<25)
		{
			System.out.println("you can go to the piknic");
		}
		else if(heat>5&&heat<15)
		{
			System.out.println("you can go to the cinema");
		}
		else if(heat<5)
		{
			System.out.println("you can skiing");
		}
	}

}
