package com.pratiti.exceptionHandling;

class BankAccount{
	int acno;
	double balance;
	
	public BankAccount(int acno, double balance) {
		super();
		this.acno = acno;
		this.balance = balance;
	}
	//throws Exception = it tells that it might throw something (just like return type)
	// must be handled before run ( Compile-time Exception)
	double withdraw(double amount)throws Exception{		
		if(amount>balance) {
			Exception e = new Exception("Insufficient Balance");
			throw e;
		}else {
			balance-=amount;
			return balance;
		}
	}
	//throws Exception = it tells that it **might** throw something (just like return type)
	double withdraw2(double amount)throws RuntimeException{		
		if(amount>balance) {
			RuntimeException e = new RuntimeException("Insufficient Balance");
			throw e;
		}else {
			balance-=amount;
			return balance;
		}
	}
}
public class Example2 {
	public static void main(String[] args) {
		BankAccount bankAcc = new BankAccount(1001,5000);
		try {
			double balance = bankAcc.withdraw(6000);
			System.out.println("Balance Left = " + balance);
		}catch(Exception e){
			System.out.println(e.getMessage() );
		}
//		double balance = bankAcc.withdraw(6000);		// Error  ->  as it through exception
		double balance2 = bankAcc.withdraw2(6000);		// as it through runtime exception
	}
}
//defining my own exception   ************************************
//class myException extends Exception {
class myException extends RuntimeException {
	public myException(String msg) {
		super(msg);
	}
}