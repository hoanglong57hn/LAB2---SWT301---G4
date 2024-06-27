import org.example.LeapYear;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class LeapYearTest {

    @Test
    public void testValidDate() {
        assertTrue(LeapYear.isValidDate(15, 5, 2020));
        assertTrue(LeapYear.isValidDate(29, 2, 2020));
        assertTrue(LeapYear.isValidDate(28, 2, 2019));
    }

    @Test
    public void testInvalidInputs() {
        assertFalse(LeapYear.isValidDate(15, 5, 999));
        assertFalse(LeapYear.isValidDate(15, 5, 10001));
        assertFalse(LeapYear.isValidDate(15, 0, 2020));
        assertFalse(LeapYear.isValidDate(15, 13, 2020));
        assertFalse(LeapYear.isValidDate(0, 5, 2020));
        assertFalse(LeapYear.isValidDate(32, 1, 2020));
        assertFalse(LeapYear.isValidDate(30, 2, 2020));
        assertFalse(LeapYear.isValidDate(31, 4, 2020));
    }

    @Test
    public void testMainMethodValidDate() {
        String input = "15\n5\n2020\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LeapYear.main(new String[]{});
        String expectedOutput = "Nhập ngày: Nhập tháng: Nhập năm: Ngày tháng năm bạn nhập vào hợp lệ!!!\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMainMethodInvalidInputs() {
        String inputYear = "15\n5\n999\n";
        InputStream inYear = new ByteArrayInputStream(inputYear.getBytes());
        System.setIn(inYear);

        ByteArrayOutputStream outContentYear = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContentYear));

        LeapYear.main(new String[]{});
        String expectedOutputYear = "Nhập ngày: Nhập tháng: Nhập năm: Năm nhập phải lớn hơn 1000 và nhỏ hơn 10000!\nNgày tháng năm bạn nhập vào không hợp lệ!!!\n";
        assertEquals(expectedOutputYear, outContentYear.toString());

        String inputMonth = "15\n13\n2020\n";
        InputStream inMonth = new ByteArrayInputStream(inputMonth.getBytes());
        System.setIn(inMonth);

        ByteArrayOutputStream outContentMonth = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContentMonth));

        LeapYear.main(new String[]{});
        String expectedOutputMonth = "Nhập ngày: Nhập tháng: Nhập năm: Tháng không hợp lệ!\nNgày tháng năm bạn nhập vào không hợp lệ!!!\n";
        assertEquals(expectedOutputMonth, outContentMonth.toString());

        String inputDay = "32\n1\n2020\n";
        InputStream inDay = new ByteArrayInputStream(inputDay.getBytes());
        System.setIn(inDay);

        ByteArrayOutputStream outContentDay = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContentDay));

        LeapYear.main(new String[]{});
        String expectedOutputDay = "Nhập ngày: Nhập tháng: Nhập năm: Ngày nhập vượt quá số ngày trong tháng\nNgày tháng năm bạn nhập vào không hợp lệ!!!\n";
        assertEquals(expectedOutputDay, outContentDay.toString());
    }
}

