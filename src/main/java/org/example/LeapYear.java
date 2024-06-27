package org.example;
import java.util.Scanner;
import java.time.YearMonth;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = sc.nextInt();

        System.out.print("Nhập tháng: ");
        int month = sc.nextInt();

        System.out.print("Nhập năm: ");
        int year = sc.nextInt();

        boolean isValid = true;

        if (year > 10000 || year < 1000){
            System.out.println("Năm nhập phải lớn hơn 1000 và nhỏ hơn 10000!");
            isValid = false;
        }

        if(month< 1||month >12)

        {
            System.out.println("Tháng không hợp lệ!");
            isValid = false;
        }

        if(day< 1)

        {
            System.out.println("Ngày không thể nhỏ hơn 1");
            isValid = false;
        }

        if(isValid)

        {
            YearMonth monthInYear = YearMonth.of(year, month);
            int daysInMonth = monthInYear.lengthOfMonth();

            if (day > daysInMonth) {
                System.out.println("Ngày nhập vượt quá số ngày trong tháng");
                isValid = false;
            }
        }

        if(isValid)

        {
            System.out.println("Ngày tháng năm bạn nhập vào hợp lệ!!!");
        } else

        {
            System.out.println("Ngày tháng năm bạn nhập vào không hợp lệ!!!");
        }

        sc.close();
    }


    public static boolean isValidDate(int day, int month, int year) {
        if (year > 10000 || year < 1000) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1) {
            return false;
        }

        YearMonth monthInYear = YearMonth.of(year, month);
        int daysInMonth = monthInYear.lengthOfMonth();

        return day <= daysInMonth;
    }
}
