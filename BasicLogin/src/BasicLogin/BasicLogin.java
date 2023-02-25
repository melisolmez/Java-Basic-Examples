package BasicLogin;

import java.util.Scanner;

public class BasicLogin {
	public static void main(String[]args)
	{
		String userName,passWord,newpassWord;
		String user,pass;
		user="patika";
		pass="java123";
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the user name: ");
		userName=sc.next();
		System.out.print("Enter the password: ");
		passWord=sc.next();
		
		if(userName.equals(user))
        {
			if(passWord.equals(pass))
			{
				System.out.println("Welcome..");
			}
			else if(!passWord.equals(pass))
			{
				 System.out.println("Password is not true..");
				 System.out.println("Do you want to reset your password?/n Please enter the new password:");
				 newpassWord=sc.next();
				 if(newpassWord.equals(passWord)&&newpassWord.equals(pass))
				 {
					 System.out.print("Could not create password");
				 }
				 else
				 {
					 System.out.print("password create succesfuly. ");
				 }
				 
			}
	
        }else
        {
        	System.out.println("User name is not true");
        }
		
	}

}
