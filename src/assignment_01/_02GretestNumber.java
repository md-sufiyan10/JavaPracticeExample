package assignment_01;

import java.util.Scanner;

public class _02GretestNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int num2=sc.nextInt();


        // comparing greater nnumber

        if(num1>num2)
            System.out.println("First Number is Greater:"+num1);
        else
            System.out.println("Second Number is Greater:"+num2);

        // diffrence Number
        if(num1> num2)
            System.out.println("Difference "+ (num1-num2));
        else
            System.out.println("Difference "+(num2-num1));

        // Even or Odd Check

        if(num1%2==0)
            System.out.println(num1 + " Even  Number ");
        else
            System.out.println(num2 + " Odd Number");

        if (num2%2==0)
            System.out.println(num1 + " Even Number:");
        else
            System.out.println(num2+ " Odd Number:");
    }
}
