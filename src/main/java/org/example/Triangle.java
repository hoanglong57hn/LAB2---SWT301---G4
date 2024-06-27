package org.example;

import java.util.Scanner;

public class Triangle {

    public static double getValidInput(Scanner scanner) {
        double value = 0;
        boolean validInput = false;
        while (!validInput) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Bạn phải nhập một số. Vui lòng thử lại.");
                System.out.print("Nhập độ dài cạnh a của tam giác: ");
                scanner.next(); // Đọc và loại bỏ giá trị không hợp lệ khỏi input stream
            } else {
                value = scanner.nextDouble();
                if (value <= 0) {
                    System.out.println("Bạn phải nhập một số lớn hơn 0. Vui lòng thử lại.");
                    System.out.print("Nhập độ dài cạnh a của tam giác: ");
                } else {
                    validInput = true;
                }
            }
        }
        return value;
    }

    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideA, sideB, sideC;

        do {
            System.out.print("Nhập độ dài cạnh a của tam giác: ");
            sideA = getValidInput(scanner);

            System.out.print("Nhập độ dài cạnh b của tam giác: ");
            sideB = getValidInput(scanner);

            System.out.print("Nhập độ dài cạnh c của tam giác: ");
            sideC = getValidInput(scanner);

            if (!isTriangle(sideA, sideB, sideC)) {
                System.out.println("Ba cạnh nhập vào không tạo thành tam giác hợp lệ. Vui lòng nhập lại.");
            }
        } while (!isTriangle(sideA, sideB, sideC));

        double perimeter = calculatePerimeter(sideA, sideB, sideC);
        double area = calculateArea(sideA, sideB, sideC);

        System.out.println("Chu vi của tam giác là: " + perimeter + "m");
        System.out.println("Diện tích của tam giác là: " + area + "m2");

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}
