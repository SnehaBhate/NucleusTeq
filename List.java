// List –

// 1. WAP(write a program) to store only unique elements in arraylist .
// e.g list - [1,2,1,2,1,2,1,2,1]
// o/p list- [1,2]

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);

        ArrayList<Integer> uniqueList = new ArrayList<Integer>();

        for (int element : list) {

            if (!uniqueList.contains(element)) {

                uniqueList.add(element);
            }
        }

        System.out.println("Unique elements: " + uniqueList);
    }
}