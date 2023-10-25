package com.amdocs.example.myproject;

public class savingAccount extends BankAccount {
	private double interestDeposite=0.03;
	
	
	public savingAccount(int accountNo,double intialAmount) {
		super(accountNo,intialAmount);
		
	}
     public void deposite(double amount) 
     {
    	 	double interest = amount * interestDeposite;
	        this.currentAmount = amount+ this.currentAmount+interest;//2500
	        //2500*0.03
	      // this.currentAmount+= amount;//2500+
	        System.out.println(
	        		
	                "Amount deposited: " + amount + "\nInterest credited: " + interest + "\nNew balance: " + this.currentAmount);
	        
	}

}
