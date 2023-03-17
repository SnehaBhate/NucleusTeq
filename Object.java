import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Object {

    public static void main(String[] args) {

        int data1 = 10;
        String data2 = "NucleusTeq";

        try {
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
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}

/*
 * 
 * 
 * 
 * 
 * import java.io.FileInputStream;
 * import java.io.FileOutputStream;
 * import java.io.ObjectInputStream;
 * import java.io.ObjectOutputStream;
 * import java.io.Serializable;
 * 
 * class Dog implements Serializable {
 * 
 * String name;
 * String breed;
 * 
 * public Dog(String name, String breed) {
 * this.name = name;
 * this.breed = breed;
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) {
 * 
 * // Creates an object of Dog class
 * Dog dog = new Dog("Tyson", "Labrador");
 * 
 * try {
 * FileOutputStream file = new FileOutputStream("file.txt"); //file need to be
 * change
 * 
 * // Creates an ObjectOutputStream
 * ObjectOutputStream output = new ObjectOutputStream(file);
 * 
 * // Writes objects to the output stream
 * output.writeObject(dog);
 * 
 * FileInputStream fileStream = new FileInputStream("file.txt");
 * 
 * // Creates an ObjectInputStream
 * ObjectInputStream input = new ObjectInputStream(fileStream);
 * 
 * // Reads the objects
 * Dog newDog = (Dog) input.readObject();
 * 
 * System.out.println("Dog Name: " + newDog.name);
 * System.out.println("Dog Breed: " + newDog.breed);
 * 
 * output.close();
 * input.close();
 * }
 * 
 * catch (Exception e) {
 * e.getStackTrace();
 * }
 * }
 * }
 */