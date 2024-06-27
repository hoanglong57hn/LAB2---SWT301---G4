package org.example;

import java.util.Scanner;

public class Triangle {
    public static boolean isValidTriangle(double a, double b, double c) {
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
            sideA = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh b của tam giác: ");
            sideB = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh c của tam giác: ");
            sideC = scanner.nextDouble();

            if (!isValidTriangle(sideA, sideB, sideC)) {
                System.out.println("Ba cạnh nhập vào không tạo thành tam giác hợp lệ. Vui lòng nhập lại.");
            }
        } while (!isValidTriangle(sideA, sideB, sideC));

        double perimeter = calculatePerimeter(sideA, sideB, sideC);

        double area = calculateArea(sideA, sideB, sideC);

        System.out.println("Chu vi của tam giác là: " + perimeter+"m");
        System.out.println("Diện tích của tam giác là: " + area+"m2");

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}
