package com.amdocs.example.myproject;

public class BankAccount {
	
	protected  int accountNumber;
	protected double currentAmount;
	
	//create a Constructor
	
	public  BankAccount(int accountNumber,double intialAmount)
	{
		this.accountNumber=accountNumber;
		this.currentAmount=intialAmount;
		System.out.println("Dear Customer, Account # "+accountNumber +"  created with an initial balance of " +intialAmount);
		
		
	}
	
	
	//rest of methods
	
	public void deposite(double dAmount)
	{
		if(dAmount>0)
		{
		  this.currentAmount += dAmount;
		  System.out.println("Dear Customer, An Amount of INR " + dAmount+ " has been DEPOSITE to your "+accountNumber+".");
		}
		else
		{
			System.out.println("Invalid Deposite Amount");
		}
	}
	
	public void withdraw(double wAmount)
	{
		if(wAmount>0 && wAmount<=currentAmount)
		{
		this.currentAmount-=wAmount;
		System.out.println("Dear Customer, your a/c. "+accountNumber+ " is Debited for "+wAmount+" \nCurrent Balance:: "+this.currentAmount);
		}
		else
		{
			System.out.println("Invalid withdrawal amount or insufficient balance");
		}
		
	}
	
	public void checkBalance()
	{
		System.out.println("Dear Customer, net available balance is: "+this.currentAmount);
	}
	
	public void transferFunds(double tAmount,BankAccount recipient)
	{
		if(tAmount > 0 && tAmount<=currentAmount)
		{
			this.withdraw(tAmount);
			recipient.deposite(tAmount);
			
			System.out.println("Dear Customer,Transferred " + tAmount + " from Account #" + accountNumber + " to Account #" + recipient.accountNumber);
			//System.out.println("Dear Customer,Net Balance of B1: "+this.currentAmount +"\nNet Balance of recipient "+recipient.currentAmount );
		}
		else
		{
			System.out.println(tAmount+" Invalid transfer amount or insufficient account balance");
		}
	}
	
	
	
	
	

}
