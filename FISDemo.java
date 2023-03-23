import java.io.*;

public class FISDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream("abc.txt");

        int data;
        while ((data = fis.read()) != -1) { // read method can read only one byte at a time.
            // System.out.println("data " + data); // prints 82 bcz read method reading the
            // charcater
            // and stored in int type of variable.
            // if the byte is not available then it returns -1
            System.out.println("data " + (char) data);
        }
        fis.close();

    }

}
