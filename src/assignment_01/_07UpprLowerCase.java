package assignment_01;

import java.util.Scanner;

public class _07UpprLowerCase {
    static void main() {
        Scanner sc=new Scanner(System.in);
        IO.println("Enter the Character.");
        char ch=sc.next().charAt(0);

        if (ch >='A' && ch <='Z')
            System.out.println("Character is UpperCase:"+ch);
        else if (ch>='a' && ch<='z')
            System.out.println("Character is LowerCase:"+ch);

        else
            IO.println("Please enter Valid Character.");
    }
}
