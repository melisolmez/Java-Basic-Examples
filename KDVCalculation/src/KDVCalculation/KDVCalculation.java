package KDVCalculation;

public class KDVCalculation {
	
	public void kdvCalculation(float money)
	{
		double kdv;
		if(money>1000)
		{
			System.out.println("Money : "+money);
			kdv=money*(0.08);
			System.out.println("Money kdv : "+(money+kdv));
			System.out.println("KDV : "+ "0.08");
		}
		else
		{
			System.out.println("Money : "+money);
			kdv=money*(0.18);
			System.out.println("Money kdv : "+(money+kdv));
			System.out.println("KDV : "+ "0.18");
			
		}
	}
}
