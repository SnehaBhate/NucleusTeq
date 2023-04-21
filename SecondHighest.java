import java.util.Scanner;

public class SecondHighest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array = ");
        int size = sc.nextInt();
        int i, j;

        int arr[] = new int[size];

        System.out.println("Enter the elements - ");

        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int temp;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Second Highest Element in array is - " + arr[size - 2]);

    }

}
