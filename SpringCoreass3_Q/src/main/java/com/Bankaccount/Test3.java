package com.Bankaccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static ApplicationContext context;
	public static void main(String[] args) {
		
		context=new ClassPathXmlApplicationContext("beans3.xml");
		
		BankAccountController controller=(BankAccountController) context.getBean("BankAccount");
		controller.withdraw(9966, 2000);
		
		controller.deposit(9966, 500);
		controller.getBalance(9966);
		controller.fundTransfer(9966, 9955, 600);

	}

}
