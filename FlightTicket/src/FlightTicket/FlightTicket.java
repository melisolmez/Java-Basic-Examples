package FlightTicket;

import java.util.Scanner;

public class FlightTicket {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name,surname;
		int age,journeyType_,km_;
		System.out.println("Enter the your name and surname: ");
		name=sc.next();
		surname=sc.next();
		System.out.println("Enter the your age: ");
		age=sc.nextInt();
		System.out.println("Enter the distance: ");
		km_=sc.nextInt();
		System.out.println("Enter the your journey type if one direction enter 1, round trip enter 2: ");
		journeyType_=sc.nextInt();
		Ticket ticket=new Ticket();
		ticket.buyingTicket(age, journeyType_, km_);
	}

}

class Ticket
{
	public void buyingTicket(int yas,int journeyType,int KM)
	{
		float newPriceTicket;
		float priceTicket=(float) (KM*0.10);
		if(yas>0&&KM>0&&(journeyType==1||journeyType==2))
		{
			if(yas<12)
			{
				if(journeyType==2)
				{
				    newPriceTicket=(float) (priceTicket*0.7);
				    System.out.println("discounted ticket price: "+newPriceTicket);
				}else
				{
					 newPriceTicket=(float) (priceTicket*0.5);
					 System.out.println("discounted ticket price: "+newPriceTicket);
				}
		   }
			else if(yas>=12&&yas<24)
			{
				if(journeyType==2)
				{
					 newPriceTicket=(float) (priceTicket*0.3);
					 System.out.println("discounted ticket price: "+newPriceTicket);
				}
				else
				{
					newPriceTicket=(float) (priceTicket*0.1);
					System.out.println("discounted ticket price: "+newPriceTicket);
				}
				 
			}
			else if(yas>65)
			{
				if(journeyType==2)
				{
					newPriceTicket=(float) (priceTicket*0.5);
					System.out.println("discounted ticket price: "+newPriceTicket);
				}
				else
				{
					 newPriceTicket=(float) (priceTicket*0.3);
					 System.out.println("discounted ticket price: "+newPriceTicket);
				}
				
			}
			else
			{
				if(journeyType==2)
				{
					newPriceTicket=(float) (priceTicket*0.2);
					System.out.println("discounted ticket price: "+newPriceTicket);
				}
				else
				{
					System.out.println("Ticket price: "+priceTicket);
				}
				
			}	
		}
		else
		{
			System.out.println("you entered wrong data");
			
		}
		
	}	
}