import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Triangle;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TriangleTest {

    // Helper method to simulate user input and capture output
    private double[] simulateUserInput(String input) {
        InputStream stdin = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Scanner scanner = new Scanner(System.in);
        double sideA = Triangle.getValidInput(scanner);
        double sideB = Triangle.getValidInput(scanner);
        double sideC = Triangle.getValidInput(scanner);

        // Reset System.in to its original state
        System.setIn(stdin);

        return new double[]{sideA, sideB, sideC};
    }

    @Test
    public void testGetValidInput() {
        String input = "3.0\n4.0\n5.0\n";
        double[] expected = {3.0, 4.0, 5.0};
        assertArrayEquals(expected, simulateUserInput(input), 0.001);

        input = "a\n3.0\nb\n4.0\n%\n5.0\n";
        expected = new double[]{3.0, 4.0, 5.0};
        assertArrayEquals(expected, simulateUserInput(input), 0.001);

        input = "-3\n3.0\n-4\n4.0\n-5\n5.0\n";
        expected = new double[]{3.0, 4.0, 5.0};
        assertArrayEquals(expected, simulateUserInput(input), 0.001);
    }

    @Test
    public void testIsTriangle() {
        assertTrue(Triangle.isTriangle(3, 4, 5));
        assertFalse(Triangle.isTriangle(1, 1, 2));
        assertFalse(Triangle.isTriangle(0, 4, 5));
        assertFalse(Triangle.isTriangle(-3, 4, 5));
        assertTrue(Triangle.isTriangle(5, 5, 5));
    }

    @Test
    public void testCalculateArea() {
        assertEquals(6.0, Triangle.calculateArea(3, 4, 5), 0.001);
        assertEquals(0.433, Triangle.calculateArea(1, 1, 1), 0.001);
    }

    @Test
    public void testCalculatePerimeter() {
        assertEquals(12.0, Triangle.calculatePerimeter(3, 4, 5), 0.001);
        assertEquals(3.0, Triangle.calculatePerimeter(1, 1, 1), 0.001);
    }
}