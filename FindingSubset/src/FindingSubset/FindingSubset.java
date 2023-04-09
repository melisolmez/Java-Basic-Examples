package FindingSubset;

import java.util.Scanner;

public class FindingSubset {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int size,countSubset=0;
		System.out.println("Cluster size: ");
		size=sc.nextInt();
		int []cluster=new int[size];
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println(i+".Cluster member:");
			cluster[i]=sc.nextInt();
		}
		countSubset=(int) Math.pow(2, size);		
		Subset subSet=new Subset();
		System.out.println("Cluster subset total is :"+countSubset);
		System.out.print(subSet.subset(cluster));
		
	}

}
