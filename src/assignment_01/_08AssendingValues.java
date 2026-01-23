package assignment_01;

import java.util.Scanner;

public class _08AssendingValues
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Value.");
        int a=sc.nextInt();

        System.out.println("Enter the Second Value.");
        int b=sc.nextInt();

        System.out.println("Enter the Third Value.");
        int c=sc.nextInt();
        int temp;
        if (a>b)
        {  // swap a and b
            temp=a;
            a=b;
            b=temp;
        }
        // swap a and c
        if (a>c)
        {
            temp = a;
            a = c;
            c = temp;
        }
        // swap b and c
        if (b>c)
        {
            temp=b;
            b=c;
            c=temp;
        }
        System.out.println("Ascending order: " + a + " " + b + " " + c);
    }
}
