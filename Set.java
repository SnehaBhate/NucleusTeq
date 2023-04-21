
// WAP to store only unique elements of array.
// i/p int[] arr = {1,2,3,1,2,3,3,3,3}
// o/p set= (1,2,3)
import java.util.*;

public class Set {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3, 3, 3, 3 };

        // create a HashSet and add the elements of the array

        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueSet.add(arr[i]);
        }

        System.out.println(uniqueSet);
    }
}
