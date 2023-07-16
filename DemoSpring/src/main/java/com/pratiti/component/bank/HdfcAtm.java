package com.pratiti.component.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HdfcAtm implements Atm {

	@Autowired
//	private Bank bank;
	private List<Bank> banks;

	public void withdraw(int acno, double amount) {
		System.out.println("from Hdfc Bank want withdraw");
		for (Bank bank : banks)
			if (bank.isCustomer(acno)) {
				bank.canWithdraw(111, acno, amount);
				break;
			}
	}

}
