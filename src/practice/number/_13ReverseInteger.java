package practice.number;

import java.util.Scanner;

public class _13ReverseInteger {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        IO.println("Enter a Number:");
        int num=scanner.nextInt();
         int rev=0; int rem;  int sum = 0;

         while(num!=0){
             rem=num%10;
             rev=rev*10+rem;  // reverse logi
             sum=sum+rem;   // sum of digit
             num=num/10;    // remove last digit
         }
         IO.println("Reversed Number:"+rev);
        System.out.println("Sum of Digits of Reverse Number: " + sum);

    }
    /* Enter a Number:1234
      Reversed Number:4321
      */

}
