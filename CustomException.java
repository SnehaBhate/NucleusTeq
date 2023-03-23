public class CustomException {

    // Example of custom exception
    public static void main(String[] args) {

        try {
            validateAge(15); // This will throw an AgeException
        } catch (AgeException e) {
            System.out.println("Caught AgeException: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age is less than 18");
        }
    }

}

// custom exception class
class AgeException extends Exception {

    public AgeException(String message) {
        super(message);
    }
}
