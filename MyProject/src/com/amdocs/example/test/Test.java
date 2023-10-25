package com.amdocs.example.test;

import com.amdocs.example.myproject.BankAccount;
import com.amdocs.example.myproject.currentAccount;
import com.amdocs.example.myproject.savingAccount;

public class Test {

	public static void main(String[] args) {
		
//	BankAccount B1 = new BankAccount(101,50000);
//	B1.deposite(50000);
//	B1.withdraw(20000);
//	B1.checkBalance(); 
//	
	
	//40000
//		B1.transferFunds(30000, recipient);
//		B1.checkBalance(); //10000
//		recipient.checkBalance();//80000
		
	savingAccount s1 = new savingAccount(101,50000);
//	s1.deposit(40000);
//	s1.checkBalance();
	
currentAccount c1= new currentAccount(103,25000);
	
	c1.withdraw(20000);
	c1.transferFunds(500, s1);
	c1.checkBalance();
	s1.checkBalance();
	
	//c1.transferFunds(2000, s1);
	//c1.checkBalance();
		

    
        
        
        
		
		
		
		
		
		
		
		
		
	}

}
