package practice.number;

import java.util.Scanner;

public class _07NumberOfDigits {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=scanner.nextInt();
        int count=0;
        int temp=num;
        while(temp!=0){
            temp=temp/10;  // remove last digit
            count++;      // count increase
        }
         IO.println("Number of Digits :"+num+" = "+count);
    }

}
