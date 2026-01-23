package practice.array;

import java.util.Scanner;

public class _10SumArray {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Sum Arrays:");
        System.out.println("Enter the Size of Array:");
        int size=scanner.nextInt();
     //   System.out.println("Enter the Element in An Array One By One:");
        int []num=new int[size];
        for (int i=0 ; i<size; i++){
            System.out.print("Please enter element no " + (i + 1) + ": ");
            num[i]=scanner.nextInt();
        }
        int result= Sum(num);
        System.out.println("Sum Array:"+result);

    }

    static int  Sum(int[] arr){
        int sum=0;
        for (int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
