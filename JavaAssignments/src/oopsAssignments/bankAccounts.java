package oopsAssignments;
import java.io.*;
import java.util.*;
import exception.SavingsAccount;

public class bankAccounts {
	public static void main(String[] args) {
		int a1,a2,TotalCash;
		bankAccounts b1=new SavingsAccount();
		bankAccounts b2= new CurrentAccount();
		a1=((SavingsAccount) b1).cash();
		a2=((CurrentAccount) b2).cash();
		TotalCash=a1+a2;
		System.out.println("Total cash in the bank is Rs."+TotalCash);
	}

}
