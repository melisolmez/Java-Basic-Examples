package FindingSubset;

public class Subset {
	
	public String subset(int[]cluster)
	{
		
         String s="";
		
		for(int i=0;i<Math.pow(2, cluster.length);i++)
		{
			int b=i;
			
			s+="(";
			
			for(int j=0;j<cluster.length;j++)
			{
				if((b&1)==1)  // b'nin en sağdaki(en önemsiz biti) bitinin 1 e eşit olup olmadığını kontrol eder.
				{
					s+=cluster[j]+",";
			
				}
				
				b=b >>1;
			}
			s+=")  ";
			
		}
		
		return s;
		
	}

}
