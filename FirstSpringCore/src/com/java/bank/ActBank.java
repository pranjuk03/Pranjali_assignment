package com.java.bank;

public class ActBank {
	public int AccountId;
	public String AccountHolderName;
	public String AccountType;
	public long AccountBalance;
	public int getAccountId() {
		return AccountId;
	}
	public void setAccountId(int accountId) {
		this.AccountId = accountId;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.AccountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		this.AccountType = accountType;
	}
	public long getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.AccountBalance = accountBalance;
	}
	
	  public void showBankAccountDetails(){
	        System.out.println("Account Id : " + AccountId);
	        System.out.println("Account Holder Name : " + AccountHolderName);
	        System.out.println("AccountType : " + AccountType);
	        System.out.println("AccountBalance : " + AccountBalance);

	    }	
}
