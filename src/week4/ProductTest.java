package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductPropertiesAndIsAffordable() {
        Product product = new Product("Laptop", 500.0, 2);

        assertAll("Verify Product properties and behavior",
            // Verify that the name is not null
            () -> assertNotNull(product.getName(), "Product name should not be null"),
            
            // Verify that the price is positive
            () -> assertTrue(product.getPrice() > 0, "Price should be a positive value"),
            
            // Verify that the isAffordable() method works correctly
            () -> assertTrue(product.isAffordable(1000.0), 
            		"Product should be affordable within a budget of 1000"),
            () -> assertFalse(product.isAffordable(900.0), 
            		"Product should not be affordable within a budget of 900")
        );
    }
}
