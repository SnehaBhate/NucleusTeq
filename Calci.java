//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1.ADDITION 2.SUBTRACTION 3. MULTIPLICATION 4.DIVISION 5.MODULO/REMAINDER");
        System.out.println("enter the choice - ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else
                    System.out.println(a / b);
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else
                    System.out.println(a % b);
                break;
            default:
                System.out.println("Please Enter Valid Choice");
        }

        sc.close();
    }
}
