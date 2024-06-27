import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Triangle;
public class TriangleTest {

    @Test
    public void testIsValidTriangle() {
        assertTrue(Triangle.isValidTriangle(3, 4, 5));
        assertFalse(Triangle.isValidTriangle(1, 2, 6));
        assertEquals(Triangle.isValidTriangle("a","b","c"));
    }

    @Test
    public void testCalculateArea() {
        double expectedArea = 6.0; // Assuming sides are 3, 4, 5
        assertEquals(expectedArea, Triangle.calculateArea(3, 4, 5), 0.001);
    }

    @Test
    public void testCalculatePerimeter() {
        double expectedPerimeter = 12.0; // Assuming sides are 3, 4, 5
        assertEquals(expectedPerimeter, Triangle.calculatePerimeter(3, 4, 5), 0.001);
    }
}
