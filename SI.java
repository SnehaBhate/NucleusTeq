
import java.util.*;

public class SI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal");

        double principal = sc.nextDouble();

        System.out.print("Enter the rate: ");

        double rate = sc.nextDouble();

        System.out.println("Enter the time ");

        double time = sc.nextDouble();

        double interest = (principal * time * rate) / 100;

        System.out.println("Simple Interest: " + interest);

        sc.close();

    }
}
}
