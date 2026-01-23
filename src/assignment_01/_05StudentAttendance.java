package assignment_01;

import java.util.Scanner;

public class _05StudentAttendance {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number of classes Held.");
        int class_held=sc.nextInt();

        System.out.println("Enter the Number of classes Attended :");
        int classesAttended=sc.nextInt();

         double percentage= ((double)classesAttended/class_held)*100;
         // Attended Percentage
        System.out.println("Attendance Percentage :"+percentage);

        // condition
        if (percentage >= 75)
            System.out.println("Student is Allowed to Sit in Exam:");
        else
            System.out.println("Student does Not Allowed to sit in Exam.");
    }
}
