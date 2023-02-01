package HypotenuseİnTriangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		double edge1,edge2;
		Scanner sc=new Scanner(System.in);
		HypotenuseİnTriangle triangle=new HypotenuseİnTriangle();
		System.out.println("Enter the edge1 and edge2: ");
		edge1=sc.nextDouble();
		edge2=sc.nextDouble();
		System.out.println("Your triangle hypotenuse is : "+triangle.hypotenuse(edge1,edge2));
		System.out.println("Your triangle area is : "+triangle.areaTriangle(edge1,edge2));
		System.out.println("Your triangle perimeter is : "+triangle.perimeterTriangle());
	
		
		
		
		
		
		
		

	}

}
