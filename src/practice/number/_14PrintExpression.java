package practice.number;

import java.util.Scanner;

public class _14PrintExpression
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character:");
        sc.nextLine();
        char ch = 0;

        if(ch =='a' &&  ch =='z')
            System.out.println("Lower Case :"+ch);

        else if(ch =='A' && ch =='Z')
            System.out.println("Upper Case :" +ch);
        else
            System.out.println("Invalid Character");

        }


    }

