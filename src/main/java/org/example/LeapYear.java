package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        if (isValidDate(day, month, year)) {
            System.out.println("Ngày bạn nhập: " + day + "/" + month + "/" + year);
            if (isLeapYear(year)) {
                System.out.println(year + " là năm nhuận.");
            } else {
                System.out.println(year + " không phải là năm nhuận.");
            }
        } else {
            System.out.println("Ngày tháng năm không hợp lệ.");
        }
        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        // Năm nhuận là năm chia hết cho 4, nhưng không chia hết cho 100,
        // trừ khi năm đó cũng chia hết cho 400.
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        // Kiểm tra tháng hợp lệ
        if (month < 1 || month > 12) {
            return false;
        }

        // Kiểm tra ngày hợp lệ cho từng tháng
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day < 1 || day > daysInMonth[month - 1]) {
            return false;
        }

        // Kiểm tra năm hợp lệ
        if (year < 1) {
            return false;
        }

        return true;
    }
}

