import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data {

    public static void main(String[] args) throws IOException {

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("file3.dat"))) {

            dout.writeDouble(1.1);
            dout.writeInt(55);
            dout.writeBoolean(true);
            dout.writeChar('4');
        }

        // Catch block to handle the exceptions
        catch (FileNotFoundException ex) {

            // Display message when FileNotFoundException occurs
            System.out.println("Cannot Open the Output File");
            return;
        }

        // Reading the data back.

        // Try block to check for exceptions
        try (DataInputStream din = new DataInputStream(new FileInputStream("file3.dat"))) {

            // Illustrating readDouble() method
            double a = din.readDouble();

            // Illustrating readInt() method
            int b = din.readInt();

            // Illustrating readBoolean() method
            boolean c = din.readBoolean();

            // Illustrating readChar() method
            char d = din.readChar();

            // Print the values
            System.out.println("Values: " + a + " " + b + " " + c + " " + d);
        }

        // Catch block to handle the exceptions
        catch (FileNotFoundException e) {

            // Display message when FileNotFoundException occurs
            System.out.println("Cannot Open the Input File");
            return;
        }
    }

}
