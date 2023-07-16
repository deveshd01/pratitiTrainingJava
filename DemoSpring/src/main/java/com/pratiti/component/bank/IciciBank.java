package com.pratiti.component.bank;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank {

	public boolean canWithdraw(int atmId, int accNo, double amount) {
		System.out.println("Icici bank Withdraw approved");
		return true;
	}

	public boolean isCustomer(int accno) {
		if (accno == 1111)
			return true;
		return false;
	}

}
