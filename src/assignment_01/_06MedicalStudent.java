package assignment_01;

import java.util.Scanner;

public class _06MedicalStudent {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the class Held.");
        int class_held=sc.nextInt();

        System.out.println("Enter the class Attendance.");
        int clsss_attendenc=sc.nextInt();

        System.out.println("Do you have a Medical Issue: (Y/N)");
        char medical_issue= sc.next().charAt(0);
        double percentage= ((double) clsss_attendenc/class_held)*100;

        System.out.println("Attendenc Percentage.."+percentage + " % ");

           if(percentage >= 75 || medical_issue == 'Y' || medical_issue == 'y')
           IO.println("Student is Allowd to Sit in Exam Center.");
          else
            IO.println("Student does not allowed to Sit in Exam Center.");
    }
}
