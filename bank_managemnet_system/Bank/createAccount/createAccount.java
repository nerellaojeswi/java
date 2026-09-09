package com.Bank.createAccount;
import java.util.Scanner;

import com.Bank.Bank;
import com.Bank.Service;

import java.util.Random;
public class createAccount {
	public static void createaccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("*****----New Account Creation----*****");
		System.out.println("Enter Name : ");
		String accountHolderName=sc.next();
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		System.out.println("Enter PhoneNumber : ");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter AccountTypee");
		String accountType=sc.next();
		System.out.println("Enter Balance");
		double balance=sc.nextDouble();
		Random random=new Random();
		long accountNumber=0;
		for(int i=0;i<12;i++) {
			accountNumber = accountNumber * 10 + random.nextInt(11);
		}
		Bank bank = new Bank(accountNumber, accountHolderName, age,phoneNumber, accountType, balance);
		Service.banking[Service.count] = bank;
		Service.count++;
		System.out.println("Account Created Successfully");
        System.out.println("Account Number: " + accountNumber);
	}
}
