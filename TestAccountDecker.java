//Calls Date and Scanner Utils
import java.util.*;

public class TestAccountDecker 
{
	public static void main (String[] args)
	{
		AccountDecker myObject = new AccountDecker(123456, 10000);
		
		System.out.println("Account ID: \t\t\t" + myObject.GetID());
		myObject.withdraw(3500);
		myObject.deposit(500);
		System.out.printf("Account Balance: \t\t" + "$%,.2f\n", (myObject.getBalance()));
		System.out.printf("Earned Monthly Interest: \t" + "$%,.2f\n", (myObject.getMonthlyInterest()));
		System.out.println("Date Created: \t\t\t" + myObject.getDate());
		System.out.println(" ");
		

		System.out.println("Demonstrates output when the toString Method is Called: ");
		System.out.print(myObject);
		
		  Scanner input = new Scanner(System.in);
	      String answer = "";
	      
	      do
	      {
		      do
		      {
	      
	            int acctId;
	            double initialBalance;
	            double intRate;
	            double withdrawAmt;
	            double depositAmt;
	                         
	            
	            System.out.println("Enter information for MyAccount:");
	            System.out.print("Enter your account id:  ");
	            acctId= input.nextInt();
	      
	            System.out.printf("Enter your initial balance:  ");
	            initialBalance = input.nextDouble();
	            
	            System.out.print("Enter rate of interest earned:  ");
	            intRate = input.nextDouble();
	      
	            System.out.print("Enter amount of withdrawals:  ");
	            withdrawAmt = input.nextDouble();
	            
	            System.out.print("Enter amount of deposits:  ");
	            depositAmt = input.nextDouble();
	     
	            //Create new Acccount object and call methods
	            AccountDecker myAccount = new AccountDecker(acctId, initialBalance);
	            myAccount.withdraw(withdrawAmt);
	            myAccount.deposit(depositAmt);
	            myAccount.setAnnualInterestRate(intRate);
	            myAccount.getAnnualInterestRate();
	            System.out.print(myAccount);
		   
	            
	            System.out.println("Enter information for yourAccount:");
	            System.out.print("Enter your account id:  ");
	            acctId= input.nextInt();
	            
	            System.out.printf("Enter your initial balance:  ");
	            initialBalance = input.nextDouble();
	            
	            System.out.print("Enter rate of interest earned:  ");
	            intRate = input.nextDouble();
	      
	            System.out.print("Enter amount of withdrawals:  ");
	            withdrawAmt = input.nextDouble();
	            
	            System.out.print("Enter amount of deposits:  ");
	            depositAmt = input.nextDouble();
	     
	            
	            AccountDecker yourAccount = new AccountDecker(acctId, initialBalance);
	            yourAccount.withdraw(withdrawAmt);
	            yourAccount.deposit(depositAmt);
	            yourAccount.setAnnualInterestRate(intRate);
	            yourAccount.getAnnualInterestRate();
	            System.out.print(yourAccount);
	      
	          	
	      	   System.out.print("Do you want to enter new values? (Y/N): ");
	      	   System.out.println("");
	      	   input.nextLine();
	      	   answer = input.nextLine();
		         }

		      while (!answer.equals("N"));
	      }
	      while (!answer.equals("N"));
		   System.out.println("Program Terminated");
	}
}
