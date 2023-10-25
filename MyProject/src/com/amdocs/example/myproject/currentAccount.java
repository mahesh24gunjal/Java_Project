package com.amdocs.example.myproject;

public class currentAccount extends BankAccount {
	
	
	
	
	public currentAccount(int accountNo,double intialAmount)
	{
		super(accountNo,intialAmount);
		
	}
	
	public void withdraw(double wAmount)
	{
		if(wAmount >0 && wAmount<=this.currentAmount)
		{
			if(this.currentAmount-wAmount>=200)
			{
			    super.withdraw(wAmount);
				this.currentAmount-=200;
				System.out.println("Withdrawal fee charged: INR 200");
				
				
			}
			else
			{
				System.out.println("Insufficient balance after withdrawal fee");
				
			}
			
	}
		else
			
		{
			System.out.println("Invalid withdrawal amount");
		}
	

	}
}



	


