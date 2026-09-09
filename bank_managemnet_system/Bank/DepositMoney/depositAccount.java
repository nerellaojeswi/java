package com.Bank.DepositMoney;
import java.util.Scanner;

import com.Bank.Service;
public class depositAccount{
	public static void depositAccountt() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		long accountNumber =sc.nextLong();
		for(int i=0;i<Service.count;i++) {
			if(Service.banking[i].getaccountNumber()==accountNumber) {
				System.out.println("Enter amount deposit");
				double deposit=sc.nextDouble();
				double totalamount=Service.banking[i].getbalance()+deposit;
				Service.banking[i].setbalance(totalamount);
				System.out.println("Amount deposited successfully");
				System.out.println("Actual Amount : "+totalamount);
			}
		}
		
	}
	

}
