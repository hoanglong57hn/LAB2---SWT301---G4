package org.example;

import java.util.Scanner;

public class GCDandLCM {
    // Hàm tính ước chung lớn nhất (UCLN) sử dụng thuật toán Euclid
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm tính bội chung nhỏ nhất (BCNN)
    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ người dùng
        System.out.print("Nhập số thứ nhất: ");
        int number1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int number2 = scanner.nextInt();

        // Tính và in ra UCLN và BCNN của hai số
        int gcd = calculateGCD(number1, number2);
        int lcm = calculateLCM(number1, number2);

        System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + gcd);
        System.out.println("Bội chung nhỏ nhất của " + number1 + " và " + number2 + " là: " + lcm);

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}

