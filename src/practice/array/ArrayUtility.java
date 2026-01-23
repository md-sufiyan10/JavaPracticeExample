package practice.array;

import java.util.Scanner;

public class ArrayUtility {
    // Method to take array input
    public static int[] inputArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

    // Method to print array elements
    public static void printArray(int[] nums) {
       // System.out.println("Array elements are:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println(); // for new line
    }
}
