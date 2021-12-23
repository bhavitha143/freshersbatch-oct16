package Arthemetic;

import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class Account {
	
	private int balance = 3000;
	public int balance() {
	return balance;
	}
	public void withdraw(int amount) throws InsufficientResourcesException {
	if (amount > balance) {
	throw new InsufficientResourcesException(String.format(
	"Current balance %d is less than requested amount %d",
	balance, amount));
	}
	balance = balance - amount;
	}
	public void deposit(int amount) {
	if (amount <= 0) {
	throw new IllegalArgumentException(String.format(
	"Invalid deposit amount %s", amount));
	}
	}
	} 
 class Test {
	public static void main(String args[]) throws InsufficientResourcesException {
	Account acct = new Account();
	System.out.println("Current balance : " + acct.balance());
	System.out.println("Withdrawing : 200 ");
	acct.withdraw(200);
	System.out.println("Current balance : " + acct.balance());
	acct.withdraw(3500);
	}
	}





