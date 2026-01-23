package practice.number;

import java.util.Scanner;

public class _06FactorialNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int factorial=1;
        StringBuilder steps=new StringBuilder();
        System.out.println("Enter Number:");
        int number=sc.nextInt();
        for(int i=number; i>=1;i--){
            factorial*=i;
            steps.append(i);

            if(i!=1){
                steps.append("*");
            }
        }
        IO.println("Factorial Number is "+number+ "!= "+steps +" = "+factorial);
    }
}
