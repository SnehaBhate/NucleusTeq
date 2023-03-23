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
    // Example of custom exception
    try{validateAge(15); // This will throw an AgeException
    }catch

    (

    AgeException e)
    {
        System.out.println("Caught AgeException: " + e.getMessage());
    }

    // method that throws a custom exception if age is less than 18
public static void validateAge(int age) throws AgeException {
if (age < 18) {
throw new AgeException("Age is less than 18");
        }
    }

    // custom exception class
    classAgeException extends Exception{

publicAgeException(String message) {
super(message);
    }
}
