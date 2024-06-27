package org.example;

import java.util.Scanner;

public class Circle {

    public static boolean isValidCircle(double a) {
        return (a>0);
    }

    public static double calculateArea(double a) {
        double area = Math.PI * a * a;
        return area;
    }

    public static double calculatePerimeter(double b) {
        double perimeter = 2 * Math.PI * b;
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;
        do {
            System.out.print("Nhập bán kính của hình tròn: ");
            radius = scanner.nextDouble();
            if (!isValidCircle(radius)) {
                System.out.println("Bán kính đường tròn phải > 0");
            }
        } while(!isValidCircle(radius));

        double area = calculateArea(radius);
        double perimeter = calculatePerimeter(radius);

        System.out.println("Diện tích của hình tròn là: " + area+"m2");
        System.out.println("Chu vi của hình tròn là: " + perimeter+"m");

        scanner.close();
    }
}


