package org.example;
import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double AB, CD, h;
        do {
            System.out.println("Nhập độ dài cạnh trên AB: ");
            AB = scanner.nextDouble();

            System.out.println("Nhập độ dài cạnh dưới CD: ");
            CD = scanner.nextDouble();

            System.out.println("Nhập độ dài đường cao h: ");
            h = scanner.nextDouble();

            // Kiểm tra xem có phải là hình thang
            if (isTrapezoid(AB, CD, h)) {
                double area = calculateArea(AB, CD, h);
                double perimeter = calculatePerimeter(AB, CD, h);
                System.out.println("Diện tích của hình thang là: " + area);
                System.out.println("Chu vi của hình thang là: " + perimeter);
            } else {
                System.out.println("Ba giá trị này không tạo thành hình thang! (AB != CD and h > 0)");
            }
        } while(!isTrapezoid(AB, CD, h));

        scanner.close();
    }

    // Phương thức để kiểm tra xem ba giá trị này có tạo thành hình thang hay không
    public static boolean isTrapezoid(double AB, double CD, double h) {
        // Kiểm tra điều kiện hình thang
        return (AB != CD && h > 0); // AB phải khác CD và h phải lớn hơn 0
    }

    // Phương thức tính diện tích của hình thang
    public static double calculateArea(double AB, double CD, double h) {
        return 0.5 * (AB + CD) * h;
    }

    // Phương thức tính chu vi của hình thang
    public static double calculatePerimeter(double AB, double CD, double h) {
        // Chu vi của hình thang là tổng độ dài các cạnh
        double side = Math.sqrt(Math.pow((CD - AB) / 2, 2) + Math.pow(h, 2));
        return AB + CD + 2 * side;
    }
}