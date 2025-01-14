package week4;

public class BankAccount {
	public int balance;
	void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
		}else {
			System.out.println(" Deposite Amount should be positive.");
		}
	}
	boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		 return false;
	}
}
