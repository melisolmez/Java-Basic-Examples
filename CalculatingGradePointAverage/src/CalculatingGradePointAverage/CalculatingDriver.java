package CalculatingGradePointAverage;

import java.util.Scanner;

public class CalculatingDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int note1,note2,note3;
		Calculating cal=new Calculating();
		System.out.println("Enter the math notes: ");
		note1=sc.nextInt();
		note2=sc.nextInt();
		note3=sc.nextInt();
		cal.calculatingGrade(note1, note2, note3);
		
		System.out.println("Enter the physics notes: ");
		note1=sc.nextInt();
		note2=sc.nextInt();
		note3=sc.nextInt();
		cal.calculatingGrade(note1, note2, note3);
		
		System.out.println("Enter the chemical notes: ");
		note1=sc.nextInt();
		note2=sc.nextInt();
		note3=sc.nextInt();
		cal.calculatingGrade(note1, note2, note3);
		
		System.out.println("Enter the music notes: ");
		note1=sc.nextInt();
		note2=sc.nextInt();
		note3=sc.nextInt();
		cal.calculatingGrade(note1, note2, note3);
	
	}
}
