package practice.number;

import java.util.Scanner;

public class _08PalindromeNumber {

  public static boolean isPalindrome(int num){
      int originalNumber=num;
      int reverseNUmber=0;

      while (num!=0){
          int digit=num%10;
          reverseNUmber=reverseNUmber*10+digit;
          num=num/10;
      }
      return originalNumber==reverseNUmber;
  }

    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number is:");
        int number=sc.nextInt();

        if(isPalindrome(number)){
            IO.println(number +" is a Polindrom");
        }else{
            IO.println(number+ " is not a Polindrom");
        }

    }
}
