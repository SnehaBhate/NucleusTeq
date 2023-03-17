import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {

    public static void main(String[] args) throws IOException {

        // reading
        FileInputStream fin = new FileInputStream("file1.txt");
        int ch;

        // Holds true till there is data inside file
        while ((ch = fin.read()) != -1)
            System.out.print((char) ch);

        // Close the file connections
        // using close() method
        fin.close();

        // writing
        FileOutputStream fout = new FileOutputStream("file1.txt");

        // we need to transfer this string to files
        String st = "TATA skdh olishdo";

        char cha[] = st.toCharArray();
        for (int i = 0; i < st.length(); i++) {

            // we will write the string by writing each
            // character one by one to file
            fout.write(cha[i]);
        }

        // by doing fout.close() all the changes which have
        // been made till now in RAM had been now saved to
        // hard disk
        fout.close();

    }

}
