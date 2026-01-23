package practice.array;

import java.util.Scanner;

public class _09ReverseArray {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Reverse Array:");
        int[] numArr = ArrayUtility.inputArray();
         reverse(numArr);
        System.out.println("Reverse Array Here:");
        ArrayUtility.printArray(numArr);
    }
    public static void reverse(int[] arr)
    {
           int i=0;
           while (i < arr.length/2)
           {
             int swap=arr[i];
             arr[i]=arr[arr.length-1-i];
             arr[arr.length-1-i]=swap;
               i++;
           }
    }
}
