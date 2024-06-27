package org.example;

import java.util.Scanner;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double length, width;

        // Yêu cầu người dùng nhập chiều dài và chiều rộng
        do {
            System.out.print("Nhập chiều dài của hình chữ nhật: ");
            length = getValidPositiveDouble(scanner);
            System.out.print("Nhập chiều rộng của hình chữ nhật: ");
            width = getValidPositiveDouble(scanner);

            // Kiểm tra điều kiện chiều rộng phải nhỏ hơn chiều dài
            if (width >= length) {
                System.out.println("Lỗi: Chiều rộng phải nhỏ hơn chiều dài. Vui lòng nhập lại.");
            }
        } while (width >= length);

        // Tính diện tích của hình chữ nhật
        double area = CalculateArea(length,width);

        // Tính chu vi của hình chữ nhật
        double perimeter = CalculatePerimeter(length,width);

        // In kết quả
        System.out.println("Diện tích của hình chữ nhật là: " + area+"m2");
        System.out.println("Chu vi của hình chữ nhật là: " + perimeter+"m");

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
    public static double CalculateArea(double a, double b){
        return a*b;
    }
    public static double CalculatePerimeter(double a, double b){
        return 2*(a+b);
    }
    public static double getValidPositiveDouble(Scanner scanner) {
        double value = 0;
        boolean isValid = false;
        while (!isValid) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value > 0) {
                    isValid = true;
                } else {
                    System.out.print("Lỗi: Vui lòng nhập một số dương. Nhập lại: ");
                }
            } else {
                System.out.print("Lỗi: Vui lòng nhập một số hợp lệ. Nhập lại: ");
                scanner.next(); // Loại bỏ giá trị không hợp lệ khỏi input stream
            }
        }
        return value;
    }
}



