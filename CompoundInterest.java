import java.util.Scanner;

public class CompoundInterest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time: ");
        double time = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded: ");
        int number = sc.nextInt();

        double interest = principal * (Math.pow((1 + rate / 100), (time * number))) - principal;

        System.out.println("Compound Interest: " + interest);

        sc.close();
    }

}
