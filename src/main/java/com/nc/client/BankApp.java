package com.nc.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nc.config.AppConfig;
import com.nc.model.Account;
import com.nc.model.CurrentAccount;
import com.nc.model.SavingAccount;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		Account account = (Account) context.getBean(sc.next());
		System.out.println(account.createAccount());
		System.out.println(account.getCard().getCardDetails());
		
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(AppConfig.class); try { Account account =
		 * (Account)context.getBean(sc.next());
		 * System.out.println(account.createAccount()); } catch (Exception e) {
		 * System.out.println("The bean you have entered is incorrect "+e.getMessage());
		 * }
		 */
	}
}
