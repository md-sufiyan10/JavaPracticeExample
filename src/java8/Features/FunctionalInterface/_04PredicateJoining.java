package java8.Features.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Print employee names who are working in Hyderabad (Hyd) location and in the DB team.

class Employee{
    String name;
    String location;
    String dept;

    Employee(String name, String location, String dept){
        this.name=name;
        this.location=location;
        this.dept=dept;
    }

}
public class _04PredicateJoining {
    static void main() {
      /*  List<Employee> employees = new ArrayList<>();
                employees.add(new Employee("Rahul", "Hyd", "DB"));
               employees.add(new Employee("Anita", "Pune", "DB"));
               employees.add(new Employee("Vikas", "Hyd", "Testing"));
               employees.add(new Employee("Neha", "Hyd", "DB"));
                 employees.add(new Employee("Amit", "Chennai", "DB"));

        Predicate<Employee> hydloction=p->p.location.equalsIgnoreCase("Hyd");
        Predicate<Employee> dbteam=d->d.dept.equalsIgnoreCase("DB");

        // predicate joning using AND()
        employees.stream().filter(hydloction.and(dbteam)).forEach(s-> System.out.println(s.name));*/

         Employee e1=new Employee("Sufi","Hyd","DB");
        Employee e2=new Employee("Khan","Noida","Testing");
        Employee e3=new Employee("Raza","Ddlhi","DB");
        Employee e4=new Employee("rani","Hyd","DB");

        List<Employee> employees=Arrays.asList(e1,e2,e3,e4);

        Predicate<Employee> p1= e->e.location.equals("Hyd");
        Predicate<Employee> p2=e->e.dept.equals("DB");

           Predicate<Employee> p= p1.and(p2);
        for (Employee empl : employees){
            if (p.test(empl)){
                System.out.println(empl.name);
            }
        }


    }
}
