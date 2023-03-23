import java.io.*;

public class Object {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        int data1 = 10;
        String data2 = "NucleusTeq";

        FileOutputStream file = new FileOutputStream("file4.txt");
        ObjectOutputStream output = new ObjectOutputStream(file);

        // Writing to the file using ObjectOutputStream
        output.writeInt(data1);
        output.writeObject(data2);

        FileInputStream fileStream = new FileInputStream("file4.txt");
        // Creating an object input stream
        ObjectInputStream objStream = new ObjectInputStream(fileStream);

        // Using the readInt() method
        System.out.println("Integer data :" + objStream.readInt());

        // Using the readObject() method
        System.out.println("String data: " + objStream.readObject());

        output.close();
        objStream.close();
    }
}
