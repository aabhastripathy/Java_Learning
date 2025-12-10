package org.ycpait.bankapp;

import org.ycpait.bankapp.entity.Accounts;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Accounts a = new Accounts(5000);
//a.deposit(500);
//a.withdraw(1000);
Thread wife = new Thread(() -> a.withdraw(1000));
wife.setName("WIFE");
Thread husband = new Thread(() -> a.deposit(500));
husband.setName("HUSBAND");
wife.start();
husband.start();



}

}
