package org.ycpait.bankapp.entity;

public class Accounts {
private int balance ;

public Accounts(int balance) {
	this.balance = balance;
	
}
public int getBalance() {
	return balance;
}
public void deposit(int amount) {
	System.out.println(this.balance + " Check balance by "+ Thread.currentThread().getName());
	this.balance +=  amount;
	System.out.println(this.balance + " Check balance by "+ Thread.currentThread().getName());
}
public void withdraw(int amount) {
	System.out.println(this.balance + " Check balance by "+ Thread.currentThread().getName());
	this.balance -=  amount;
	System.out.println(this.balance + " Check balance by "+ Thread.currentThread().getName());
}
}
