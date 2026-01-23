package practice.array;

import java.util.Scanner;

public class _03MissingNumberArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the Array:");
        int n =sc.nextInt();
        int arr[]=new int[n];
        IO.println("Enter "+n + " elements one by one: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=(n+1) * (n+2)/2;
        int sum=0;
        for (int num : arr){
            sum+=num;
        }
        IO.println("Missing Number is :"+(total-sum));
    }
}
