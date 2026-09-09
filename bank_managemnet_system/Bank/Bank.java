package com.Bank;

public class Bank {
	private long accountNumber;
	private String accountHolderName;
	private int age;
	private long phoneNumber;
	private String accountType;
	private double balance;
	public Bank(long accountNumber, String accountHolderName, int age,long phoneNumber,String accountType, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.accountType = accountType;
    this.balance = balance;
}
	public long getaccountNumber() {
		return this.accountNumber;
	}
	public String getaccountHolderName() {
		return this.accountHolderName;
	}
	public int getage() {
		return this.age;
	}
	public long getphoneNumber() {
		return this.phoneNumber;
	}
	public String getaccountType() {
		return this.accountType;
	}
	public double getbalance() {
		return this.balance;
	}
	public void setaccountNumber(long accountNumber) {
		 this.accountNumber=accountNumber;
	}
	public void setaccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setphoneNumber(long phoneNumber) {
		 this.phoneNumber=phoneNumber;
	}
	public void setaccountType(String accountType) {
		this.accountType=accountType;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	public void displayDetails() {
		System.out.println("AccountNumber : "+accountNumber);
		System.out.println("AccountHolderName : "+accountHolderName);
		System.out.println("Age : "+age);
		System.out.println("PhoneNumber : "+phoneNumber);
		System.out.println("AccountType : "+accountType);
		System.out.println("Balance : "+balance);
		
	}

}
