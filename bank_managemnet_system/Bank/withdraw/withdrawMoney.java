package com.Bank.withdraw;
import java.util.Scanner;

import com.Bank.Service;
public class withdrawMoney {
	public static void withdrawMoney() {
		System.out.println("Enter accountNumber");
		Scanner sc=new Scanner(System.in);
		long accountNumber=sc.nextLong();
		for(int i=0;i<Service.count;i++) {
			if(Service.banking[i].getaccountNumber()==accountNumber) {
				System.out.println("Enter withdraw amount : ");
				double withdraw=sc.nextDouble();
				if(withdraw<=Service.banking[i].getbalance()) {
					double totalamount =Service.banking[i].getbalance() - withdraw;
		            Service.banking[i].setbalance(totalamount);
		            System.out.println("Amount withdrawn successfully");
		            System.out.println("Remaining Amount : " + totalamount);
		            Service.banking[i].displayDetails();
		        } else {
		            System.out.println("Insufficient balance");
		        }
				break;
			}
		}
	}
		
}
