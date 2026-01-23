package practice.number;

import java.util.Scanner;

public class _04ReverseNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int rem,rev=0;
        System.out.println("Enter a Number:");
        int number=sc.nextInt();

        while(number!=0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        IO.println("Reverse Number is:"+rev);
    }
}
