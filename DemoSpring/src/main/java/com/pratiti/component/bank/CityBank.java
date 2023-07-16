package com.pratiti.component.bank;

import org.springframework.stereotype.Component;

@Component
public class CityBank implements Bank {

	public boolean canWithdraw(int atmId, int accNo, double amount) {
		System.out.println("city bank Withdraw approved");
		return true;
	}

	public boolean isCustomer(int accno) {
		if (accno == 2222)
			return true;
		return false;
	}

}
