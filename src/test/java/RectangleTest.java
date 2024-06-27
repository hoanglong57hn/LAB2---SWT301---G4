import org.example.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        // Test trường hợp bình thường
        assertEquals(20.0, Rectangle.CalculateArea(4.0, 5.0), 0.001);
        // Test trường hợp cạnh có giá trị nhỏ
        assertEquals(0.25, Rectangle.CalculateArea(0.5, 0.5), 0.001);
        // Test trường hợp cạnh có giá trị lớn
        assertEquals(5000000.0, Rectangle.CalculateArea(1000.0, 5000.0), 0.001);
    }

    @Test
    public void testCalculatePerimeter() {
        // Test trường hợp bình thường
        assertEquals(18.0, Rectangle.CalculatePerimeter(4.0, 5.0), 0.001);
        // Test trường hợp cạnh có giá trị nhỏ
        assertEquals(2.0, Rectangle.CalculatePerimeter(0.5, 0.5), 0.001);
        // Test trường hợp cạnh có giá trị lớn
        assertEquals(12000.0, Rectangle.CalculatePerimeter(1000.0, 5000.0), 0.001);
    }
    private double[] simulateUserInput(String input) {
        InputStream stdin = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Scanner scanner = new Scanner(System.in);
        double length = Rectangle.getValidPositiveDouble(scanner);
        double width = Rectangle.getValidPositiveDouble(scanner);

        // Reset System.in to its original state
        System.setIn(stdin);

        return new double[]{length, width};
    }

    @Test
    public void testGetValidPositiveDouble() {
        // Test nhập liệu hợp lệ

        String input = "3.0\n4.0\n";
        double[] expected = {3.0, 4.0};
        Assertions.assertArrayEquals(expected, simulateUserInput(input), 0.001);

        input = "-3.0\n4.0\nabc\n5.0\n";
        expected = new double[]{4.0, 5.0};
        Assertions.assertArrayEquals(expected, simulateUserInput(input), 0.001);

        input = "%\n4.0\nabc\n5.0\n";
        expected = new double[]{4.0, 5.0};
        Assertions.assertArrayEquals(expected, simulateUserInput(input), 0.001);

        input = "0\n4.0\n0\n5.0\n";
        expected = new double[]{4.0, 5.0};
        Assertions.assertArrayEquals(expected, simulateUserInput(input), 0.001);

    }
}
