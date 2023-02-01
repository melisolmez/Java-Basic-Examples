package CalculatingGradePointAverage;

public class Calculating {
	
	public int calculatingGrade(int note1,int note2,int note3)
	{
		int avg=(note1+note2+note3)/3;
		if(avg>60)
		{
			System.out.println("Pass the class ");
		}
		else
		{
			System.out.println("Don't Pass the class ");
		}
       return avg;
	}
	

}
