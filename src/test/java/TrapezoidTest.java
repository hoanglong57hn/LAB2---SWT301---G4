import org.example.Trapezoid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TrapezoidTest {

    @Test
    public void testIsTrapezoid() {
        assertTrue(Trapezoid.isTrapezoid(5, 10, 7));
        assertFalse(Trapezoid.isTrapezoid(5, 5, 7));
        assertFalse(Trapezoid.isTrapezoid(5, 10, -1));
        assertFalse(Trapezoid.isTrapezoid(5, 5, -1));
    }

    @Test
    public void testCalculateArea() {
        assertEquals(52.5, Trapezoid.calculateArea(5, 10, 7), 0.0001);
        assertEquals(0.0, Trapezoid.calculateArea(0, 0, 0), 0.0001);
        assertEquals(75.0, Trapezoid.calculateArea(10, 20, 5), 0.0001);
    }

    @Test
    public void testCalculatePerimeter() {
        assertEquals(32.0, Trapezoid.calculatePerimeter(5, 10, 7), 0.0001);
        assertEquals(0.0, Trapezoid.calculatePerimeter(0, 0, 0), 0.0001); // Kiểm tra không hợp lệ, có thể loại bỏ
        assertEquals(49.1421, Trapezoid.calculatePerimeter(10, 20, 5), 0.0001);
    }
}