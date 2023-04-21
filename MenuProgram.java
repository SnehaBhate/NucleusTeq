import java.util.ArrayList;
import java.util.Scanner;

// 2. create a menu program with following options .
// 1. add
// 2.remove 
// 3.display element 
// 4.exit 
// program should run until user choose 4th option.

public class MenuProgram {

    // ArrayList<Integer> ls = new ArrayList<Integer>();

    public static void Add() {
    System.out.println("Enter the elements to add in the list");
    Scanner sc;
    Object ele = sc.nextInt();
    Object ls;
    for ( ele : ls){
    ls.add(ele);

    }
    
    }

    static void Remove() {
    }

    static void Display() {
    }

    public static void main(String[] args) {

        // ArrayList<Integer> ls = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice - ");

        System.out.println("1. Add a new Element.");
        System.out.println("2.Remove an Element");
        System.out.println("3.Display Elements");
        System.out.println("4.Exit");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:

                Add();
                System.out.println("Elements are Added");
                break;
            case 2:
                Remove();
                System.out.println("Element removed");
                break;
            case 3:
                System.out.println("Elements in the List are - ");
                Display();

                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Please enter valid choice!!!");
        }

    }
}