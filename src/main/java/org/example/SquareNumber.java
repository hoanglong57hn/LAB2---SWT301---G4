package org.example;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class SquareNumber {

    public static boolean isSquareNumber(int number) {
        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt == number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số cần kiểm tra số chính phương: ");
        int number = scanner.nextInt();

        if (isSquareNumber(number)) {
            System.out.println(number + " là số chính phương.");
        } else {
            System.out.println(number + " không phải là số chính phương.");
        }

        scanner.close();
    }
}
