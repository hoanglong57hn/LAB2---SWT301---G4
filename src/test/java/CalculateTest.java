import org.example.Calculate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculateTest {

    private Calculate calculate;

    @BeforeEach
    public void setUp() {
        calculate = new Calculate();
    }

    @Test
    public void testAdd() {
        assertEquals(5.0, Calculate.add(2, 3), 0.0001);
        assertEquals(-1.0, Calculate.add(2, -3), 0.0001);
        assertEquals(0.0, Calculate.add(0, 0), 0.0001);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.0, Calculate.subtract(2, 3), 0.0001);
        assertEquals(5.0, Calculate.subtract(2, -3), 0.0001);
        assertEquals(0.0, Calculate.subtract(0, 0), 0.0001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, Calculate.multiply(2, 3), 0.0001);
        assertEquals(-6.0, Calculate.multiply(2, -3), 0.0001);
        assertEquals(0.0, Calculate.multiply(0, 0), 0.0001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, Calculate.divide(6, 3), 0.0001);
        assertEquals(-2.0, Calculate.divide(6, -3), 0.0001);
        assertEquals(0.0, Calculate.divide(0, 3), 0.0001);

        // Test division by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculate.divide(1, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}