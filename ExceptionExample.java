public class ExceptionExample {
    public static void main(String[] args) {
        // Example of ArithmeticException
        int a = 10;
        int b = 0;
        try {
            int result = a / b; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // Example of NullPointerException
        String str = null;
        try {
            int length = str.length(); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

    }
}