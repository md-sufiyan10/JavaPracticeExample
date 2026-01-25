package practice.array;

import java.util.Scanner;

public class _08PolindromArray {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome Polindrom Array:");
        System.out.println("Enter the Size of the Array:");
        int size=scanner.nextInt();
        int[] numArray=new int[size];
        System.out.println("Enter the Element in Array Step by Step: ");
        for (int i=0; i<size; i++)
        {
            numArray[i]= scanner.nextInt();
        }
        boolean is_polindrom=isPolindrom(numArray);
        if (is_polindrom)
            System.out.println("Array Polindrom:");
        else
            System.out.println("Array Not polindrom:");
    }
    public static boolean isPolindrom(int[] numArray){
        for (int i=0; i< numArray.length/2; i++)
        {
            if (numArray[i] != numArray[numArray.length-1-i])
                return false;
        }
        return true;
    }
}
