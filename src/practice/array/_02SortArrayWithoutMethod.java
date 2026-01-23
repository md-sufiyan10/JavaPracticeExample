package practice.array;

import java.util.Scanner;

public class _02SortArrayWithoutMethod {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements one by one:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();  // reads EXACT number of integers
        }

        // Sorting manually
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] > arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        System.out.println("---------------");
        System.out.println("Sorted Array is: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
