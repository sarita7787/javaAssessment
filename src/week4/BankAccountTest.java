package week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testdeposite() {
		BankAccount ac = new BankAccount();
        ac.deposite(100.0); 
        assertEquals(100.0, ac.balance, 0.001);
        System.out.println("Balance should be 100.0 after deposite.");
    } 
	@Test
	void testWithdraw() {
		BankAccount ac = new BankAccount();
		ac.deposite(100.0); 
        ac.withdraw(50.0); 
        assertEquals(50.0, ac.balance, 0.001);
        System.out.println("Balance should be 50.0 after withdraw.");
        ac.withdraw(60.0);
        assertEquals(-10.0, ac.balance, 0.001);
        System.out.println("It should be show error or failure.");
    }       

}
