import java.io.*;

public class FOSDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream("xyz.txt");
        // this constructor doesnot throw file not found exception rather it will create
        // the file.

        fos.write(5);
        System.out.println("Data is written");

        fos.close();

    }

}
