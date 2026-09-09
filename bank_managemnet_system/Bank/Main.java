package com.Bank;
import java.util.Scanner;

import com.Bank.DepositMoney.depositAccount;
import com.Bank.checkBalance.checkBalance;
import com.Bank.createAccount.createAccount;
import com.Bank.displayaccounts.displayaccounts;
import com.Bank.withdraw.withdrawMoney;
public class Main {
	public static void welcomemessage() {
		System.err.println("*****----Welcome to Bank Management System----*****");
		System.out.println(" ");
	}
	public static void options() {
		System.out.println("select the options : ");
		System.out.println("1 Display Accounts");
		System.out.println("2 create Account");
		System.out.println("3 Deposit Money");
		System.out.println("4 withdraw Money");
		System.out.println("5 checkBalance");
		System.out.println("6 update Account");
		System.out.println("7 Exit");
	}
	public static void selectedoptions(Scanner sc) {
		boolean isExit=false;
		while(!isExit) {
			int option=sc.nextInt();
			switch(option) {
			case 1 ->{
				displayaccounts.displayaccounts();
			}
			case 2->{
				createAccount.createaccount();
			}
			case 3->{
				depositAccount.depositAccountt();
			}
			case 4->{
				withdrawMoney.withdrawMoney();
			}
			case 5->{
				checkBalance.checkBalance();
			}
			case 6->{
				isExit=true;
			}
			default-> {
				System.out.println("invalid option");
			}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcomemessage();
		options();
		System.out.println("Select from list of options");
		Scanner sc=new Scanner(System.in);
		selectedoptions(sc);

	}

}
