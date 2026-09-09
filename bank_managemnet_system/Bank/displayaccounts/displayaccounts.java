package com.Bank.displayaccounts;

import com.Bank.Service;

public class displayaccounts {
	public static void displayaccounts() {
		if(Service.count==0) {
			System.out.println("No accounts is created");
			return;
		}
		for(int i=0;i<Service.count;i++) {
			Service.banking[i].displayDetails();
		}
	}

}
