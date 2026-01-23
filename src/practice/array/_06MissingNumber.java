package practice.array;

import java.util.Scanner;

public class _06MissingNumber {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n=scanner.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the Element one by one:");
        for (int i=0 ;i< n;i++){
            arr [i]= scanner.nextInt();
        }
        int total= (n+1) * (n+2)/2;
        int sum=0;
        for (int num : arr) sum=sum+num;
        System.out.println("Missing Number is :"+(total-sum));
    }
}
