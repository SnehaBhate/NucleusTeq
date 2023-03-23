import java.io.*;

public class Buffered {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("file2.txt");

        // Convert inputStream to
        // bufferedInputStream
        BufferedInputStream buffInputStr = new BufferedInputStream(inputStream);

        // Read until a single byte is available
        while (buffInputStr.available() > 0) {

            // Read the byte and
            // convert the integer to character
            char c = (char) buffInputStr.read();

            // Print the characters
            System.out.println("Char : " + c);
        }

        // writing

        FileOutputStream fout = new FileOutputStream("f1.txt");

        // creating bufferdOutputStream obj
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        // illustrating write() method

        String str = "this is the text that we r writing form pro";

        String[] string = str.split(" ");

        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {

            arr[i] = Integer.valueOf(str[i]);
        }

        bout.write(str);

        byte b[] = { 75, 76, 77, 78, 79, 80 };
        bout.write(b);

        // illustrating flush() method
        bout.flush();

        // illustrating close() method
        bout.close();
        fout.close();
    }
}