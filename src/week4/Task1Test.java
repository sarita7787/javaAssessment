package week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Task1Test {

	@Test
	//annotation
	void testCelsiusToFahrenheit() {
		CalculateTemperature ct = new CalculateTemperature();
		//expected, actual, precision(14,15 digits for double) - so point paxi 1 ta matra dinxa
		assertEquals(89.6, ct.convertCelsiusToFahrenheit(32), 0.001);
		System.out.println("This method checks the coversion for a temperature from celsius to fahrenheit.");
	}
	@Test
	void testFahrenheitToCelsius() {
		CalculateTemperature ct = new CalculateTemperature();
		assertEquals(0.00, ct.convertFahrenheitToCelsius(32), 0.001);
		System.out.println("This method checks the coversion for a temperature from fahrenheit to celsius.");
	}

}
