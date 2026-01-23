package practice.number;

import java.util.Scanner;

public class _02FibonacciSeries {
    static void main() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a terms:");
        int number=sc.nextInt();
        int first=0, second=1, next;
        System.out.println("Fibonacci Series is : ");
        for(int i=0; i<=number; i++){
            IO.print(first + " ");
            next=second+first;
            first=second;
            second=next;

        }

    }
}
