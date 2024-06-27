import org.example.PerfectNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class PerfectNumberTest {

    @Test
    public void testIsPerfectNumber() {
        assertTrue(PerfectNumber.isPerfectNumber(6));
        assertTrue(PerfectNumber.isPerfectNumber(28));
        assertFalse(PerfectNumber.isPerfectNumber(10));
        assertFalse(PerfectNumber.isPerfectNumber(12));
    }

    @Test
    public void testInvalidInputRange() {
        assertFalse(PerfectNumber.isPerfectNumber(1));
        assertFalse(PerfectNumber.isPerfectNumber(10001));
    }

    @Test
    public void testMainMethodValidPerfectNumber() {
        String input = "6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PerfectNumber.main(new String[]{});
        String expectedOutput = "Nhập số cần kiểm tra: 6 là số hoàn hảo.\n";
        System.out.println("Actual Output: " + outContent.toString());
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMainMethodInvalidNumber() {
        String input = "10001\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        PerfectNumber.main(new String[]{});
        String expectedOutput = "Nhập số cần kiểm tra: Số nhập phải lớn hơn 1 và nhỏ hơn 10000!\n10001 Số nhập không hợp lệ.\n";
        System.out.println("Actual Output: " + outContent.toString());
        assertEquals(expectedOutput, outContent.toString());
    }
}