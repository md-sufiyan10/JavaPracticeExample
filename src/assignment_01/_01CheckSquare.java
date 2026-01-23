package assignment_01;

import java.util.Scanner;

public class _01CheckSquare {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length:");
        int length=sc.nextInt();
        System.out.println("Enter the Breadth:");
        int breadth=sc.nextInt();

        // Area Calculattion
        int area=length*breadth;
        // Perimeter calculation
        int perimeter= 2 * (length+breadth);

        if(length==breadth)
            System.out.println("Given Shape is Square:");
        else
            System.out.println("Given Shape is Rectangle:");

        System.out.println("Area is:"+area);
        System.out.println("Perimeter is:"+perimeter);
    }
}
