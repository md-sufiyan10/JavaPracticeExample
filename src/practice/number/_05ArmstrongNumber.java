package practice.number;

import java.util.Scanner;

public class _05ArmstrongNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number=sc.nextInt();
        int  n=number;
        int rem,amstrong=0;
        while (n!=0){
            rem=n%10;
            n=n/10;
            amstrong=amstrong+rem*rem*rem;

        }
        System.out.println(number == amstrong ? "Armstrong" : "Not Armstrong");
    }
}
