package PrimeNumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		Boolean check=false;
		System.out.println("prime numbers from 1 to 100...");
		
		for(int i=2;i<100;i++) 
		{
			
			for(int j=2;j<i;j++) // 2<4
			{
				if(i%j==0)
				{
					check=true;
					break;
				}
			}
			
			if(!check)
			{
				System.out.println(i);
				check=false;
			}
			check=false;

		}
	}

}
