package org.example;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        System.out.print("Chọn phép toán (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                System.out.println("Kết quả: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = subtract(num1, num2);
                System.out.println("Kết quả: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = multiply(num1, num2);
                System.out.println("Kết quả: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = divide(num1, num2);
                    System.out.println("Kết quả: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ.");
                break;
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}

