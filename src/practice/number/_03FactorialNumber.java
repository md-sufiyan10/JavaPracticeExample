package practice.number;

import java.util.Scanner;

public class _03FactorialNumber {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        int factorial=1;
        IO.println("Enter any Number :");

       int number= scanner.nextInt();
       for (int i=1;i<=number;i++){
       factorial=factorial*i;
       }
        System.out.println("Factorial Number is:"+factorial);
    }
}
