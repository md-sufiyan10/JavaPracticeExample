package practice.number;

import java.util.Scanner;

public class _09SumOfDigits {

    public static int calculateSumDigit(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;  //extract the last digit
            sum=sum+digit;   // Add the digit to sum
            num=num/10;      // Remove the last digit from the  number
        }
        return sum;
    }
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number is");
       int number= scanner.nextInt();
       int sumOfDigit=  calculateSumDigit(number);
        System.out.println("Sum of Digit "+number+" is : "+sumOfDigit);
    }
}
