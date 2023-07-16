package com.pratiti.component.bank;

public interface Bank {
	boolean isCustomer(int accno);
	boolean canWithdraw(int atmId, int accNo, double amount);
}
