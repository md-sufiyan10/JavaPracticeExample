package assignment_01;

import java.util.Scanner;

public class _04EmployeeBonus {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee Salary.");
        int salary=sc.nextInt();
        System.out.println("Enter the Working Years.");
        int year=sc.nextInt();

        // logic more then 5 year then salary hike 5%
        double bonus =0;
        if (year > 5){
            bonus =(salary*5)/100;
            System.out.println("Emplyee Getting Salary Hike 5% Eligible for Bonus :=> ");
        }
           else{
            System.out.println("Employee Not Eligible for bonus..");
        }
       // final salary calculation
        double finalSalary=salary+bonus;
           // Result
        System.out.println("Bonus Amount is : "+bonus);
        System.out.println("Final Salary is :"+finalSalary);

    }
}
