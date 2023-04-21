//Write a Java program that takes two numbers as input and display the product of two numbers.

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a * b;
        System.out.println(c);
        sc.close();
    }
}