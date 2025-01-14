package week4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class NumberUtilsTest {

    @Test
    public void testGetEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        List<Integer> expected = List.of(2, 4, 6);

        List<Integer> result = NumberUtils.getEvenNumbers(input);

        assertEquals(expected, result, "The method should return only even numbers from the input array.");
    }
}
