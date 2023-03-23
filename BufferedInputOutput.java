import java.io.*;

public class BufferedInputOutput {

    public static void main(String[] args) throws Exception {

        // Creates a FileInputStream
        FileInputStream file = new FileInputStream("buffer.txt");

        // Creates a BufferedInputStream
        BufferedInputStream input = new BufferedInputStream(file);

        // Reads first byte from file
        int i = input.read();

        while (i != -1) {
            System.out.print((char) i);

            // Reads next byte from the file
            i = input.read();
        }
        input.close();
    }

}
/*
 * 
 * String data = "Hello I am Sneha";
 * 
 * // Creates a FileOutputStream
 * FileOutputStream file = new FileOutputStream("output.txt");
 * 
 * // Creates a BufferedOutputStream
 * BufferedOutputStream output = new BufferedOutputStream(file);
 * 
 * byte[] array = data.getBytes();
 * 
 * // Writes data to the output stream
 * output.write(array);
 * output.close();
 * }
 * }
 */
