package com.pi.beans;

public class Account {
	private int accountNo;
	private String accountHolderName;

	public Account(int accountNo, String accountHolderName) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + "]";
	}
	
	
}
