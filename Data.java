import java.io.*;

public class Data {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        DataOutputStream dout = new DataOutputStream(new FileOutputStream("file3.dat"));

        dout.writeDouble(1.1);
        dout.writeInt(55);
        dout.writeBoolean(true);
        dout.writeChar('4');

        // Reading the data back.

        DataInputStream din = new DataInputStream(new FileInputStream("file3.dat"));

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

        return;
    }

}