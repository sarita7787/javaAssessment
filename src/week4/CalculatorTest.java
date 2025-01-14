package week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testaddInteger() {
		Calculator c = new Calculator();
		assertEquals(5,c.addInteger(2,3));
		System.out.println("This method checks the addition of two numbers.");
	}
	

}
