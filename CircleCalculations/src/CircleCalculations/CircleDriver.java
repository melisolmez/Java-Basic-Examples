package CircleCalculations;

import java.util.Scanner;

public class CircleDriver {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		float r,angle;
		CircleCalculations circle=new CircleCalculations();
		System.out.println("Enter circle R: ");
		r=sc.nextFloat();
		System.out.println("Circle is area:  "+circle.circleArea(r));
		System.out.println("Circle is perimeter:  "+circle.circlePerimeter(r));
		System.out.println("Enter circle angle: ");
		angle=sc.nextFloat();
		System.out.println("Circle is area:  "+circle.circlePieceArea(r, angle));
		
	}

}
