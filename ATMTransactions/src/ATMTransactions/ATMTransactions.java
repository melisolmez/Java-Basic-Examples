package ATMTransactions;

import java.util.Scanner;

public class ATMTransactions {

	public static void main(String[]args)
	{
		String userName,password;
		final  String user="Melis",passWord="12345";
		int select = 0,right=3,balance=1500;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Melis ATM :)...\n"+"Please enter the userName and Password: ");
		System.out.println("User Name: ");
		userName=sc.next();
		System.out.println("Password: ");
		password=sc.next();
		
				do
				{
					if(userName.equals(user)&&password.equals(passWord))
					{
						System.out.println("successful login.");
				System.out.println("Please select the action you want to do\n"
				        +"1)Deposit money\n"
						+"2)Withdraw money\n"
						+"3)Balance query\n"
						+"4)Exit.");
				select=sc.nextInt();
				switch(select)
				{
				case 1:
					System.out.println("Enter the amount of money you want to deposit :");
					int price=sc.nextInt();
					balance+=price;
					break;
		
				case 2:
					System.out.println("Enter the amount of money you want to withdraw :");
					int price1=sc.nextInt();
					balance-=price1;	
					break;
				case 3:
					System.out.println("your balance total is:"+balance);
					break;
				case 4:
					System.out.println("Good bye...");
					break;
					
				}
					}
					else
					{
						System.out.println("Wrong enter user name or password.!");
						System.out.println("Again enter User Name: ");
						userName=sc.next();
						System.out.println("Again enter Password: ");
						password=sc.next();
					}
				}while(select!=4);
		
			
			
	
			
		
		
		
	}
}
