package practice.number;

import java.util.Scanner;

public class _01PrimeNumber {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a Number:");
        int number = scanner.nextInt();

        if (isPrimeNumber(number)) {
            System.out.println(number + " : is a prime number");
        } else {
            IO.println(number + " : is not a prime number ");
        }
    }

    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i <= num / 2; i++) {
               if(num % i==0){
                   return false;
               }
        }
             return true;
    }

}
