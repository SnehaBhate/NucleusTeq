import java.util.Scanner;

class GreaterNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first, Second and third no.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && b >= c)
            System.out.println("a is largest");
        else if (b >= a && b >= c)
            System.out.println("b is largest");
        else if (c >= a && c >= b)
            System.out.println("c is largest");

    }
}
