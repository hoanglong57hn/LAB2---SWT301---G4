import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Rectangle;
public class RectangleTest {

    @Test
    public void testCalculateArea() {
        double length = 5.0;
        double width = 3.0;
        double expectedArea = 15.0;

        double area = Rectangle.CalculateArea(length, width);
        assertEquals(expectedArea, area, 0.001);
    }

    @Test
    public void testCalculatePerimeter() {
        double length = 5.0;
        double width = 3.0;
        double expectedPerimeter = 16.0;

        double perimeter = Rectangle.CalculatePerimeter(length, width);
        assertEquals(expectedPerimeter, perimeter, 0.001);
    }
}
