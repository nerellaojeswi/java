package com.Bank.checkBalance;
import java.util.Scanner;

import com.Bank.Service;
public class checkBalance {
	public static void checkBalance() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AccountNumber : ");
		long accountNumber=sc.nextLong();
		for(int i=0;i<Service.count;i++) {
			if(Service.banking[i].getaccountNumber()==accountNumber) {
				System.out.println(Service.banking[i].getbalance());
			}
		}
	}

}
