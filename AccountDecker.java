import java.util.Date;
import java.util.Scanner;

public class AccountDecker 
{
	private int id;
	private double balance;
	private double annualInterestRate = 2.5;
	private Date dateCreated = new Date();
	
	//Contstructors
	public AccountDecker()
	{
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	
	}
	
	public AccountDecker(int acctNum, double initialBalance)
	{
		id = acctNum;
		balance = initialBalance;
	}
	
	//Modifiers
	private void setID (int acctNum)
	{
		id = acctNum;
	}
	
	private void setBalance(double initialBalance)
	{
		balance = initialBalance;
	}
	
	public void setAnnualInterestRate(double intRate)
	{
		annualInterestRate = intRate;
	}
	
	// Get Method
	public int GetID()
	{
		return id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public Date getDate()
	{
		return dateCreated;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate / 100)/12;
	}
	
	public double getMonthlyInterest()
	{
		return balance * getMonthlyInterestRate();
	}
	
	public double withdraw(double amt)
	{
		balance = balance - amt;
		return balance;
	}
	
	public double deposit (double amt)
	{
		balance = balance + amt;
		return balance;
	}
	
	//Returns a string representation of account object using id, balance , interest rate, and date opened
	public String toString()
	{
		return ("Account ID: \t\t\t" + id + "\n" + String.format("Account Balance: \t\t" + "$%,.2f\n", balance) + "Interest Rate: \t\t\t" + annualInterestRate + "%" + "\n" + "Date Opened: \t\t\t" + dateCreated + "\n\n");
	}
	
}

		

	
