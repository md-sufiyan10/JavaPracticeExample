package practice.array;

import java.util.Scanner;

public class _01SecondLargest {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        IO.println("Enter Size of the Array:");
        int n= scanner.nextInt();

        int arr[]=new int[n];
        // Taking array elements
        System.out.println("Enter "+ n+ " elements:");
        for (int i=0 ; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for (int num : arr){
            if(num > first){
                second=first;
                first=num;
            } else if (num> second && num !=first){
                second=num;
            }
        }
        IO.println("Second Largest : "+second);
    }
}
