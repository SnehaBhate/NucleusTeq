import java.util.Scanner;

class PinNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Pin Number - ");
        String pin = sc.nextLine();

        int i, count = 0;
        for (i = 0; i < pin.length(); i++) {
            if (Character.isDigit(pin.charAt(i)))
                ;// The Character class wraps a value of the primitive type char in an object. An
                 // object of class Character contains a single field whose type is char.

            count++;

        }
        if (count == 6) {
            System.out.println("Pin Number is valid");
        } else {
            System.out.println("Pin Number is not valid");
        }

    }
}
