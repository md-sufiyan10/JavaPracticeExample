package java8.Features.streamApi;

import java.util.*;
import java.util.stream.Collectors;

class Employees{
    String name;
    String location;
    double salary;

    public Employees(String name, String location, double salary) {
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Practice_09Employee {
    static void main() {
        List<Employees> list = Arrays.asList(
                new Employees("Sufiyan", "Noida", 30000),
                new Employees("Revanth", "USA", 550000),
                new Employees("Iqbal", "Hyderabad", 35000),
                new Employees("Hanfi", "Delhi", 10000),
                new Employees("Salim", "Lucknow", 40000));
        // Requirement
        //WAJP to get MAX, MIN , AVG salary from given employees data;

         /*Optional<Employees> maxSalary=list.stream()
                 .collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
        System.out.println("Maximum Salary:"+maxSalary.get().salary);

       Employees max=list.stream().max(Comparator.comparing(e -> e.salary)).get();
        System.out.println("Maximum Salary:"+max.salary);

      Employees min=  list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary))).get();
        System.out.println("Minimu Salary with Employee Details :"+min);
        System.out.println("Minimum Salary :"+min.salary);

      Double averageSalary=  list.stream().collect(Collectors.averagingDouble(e->e.salary));
        System.out.println("Average Salary:"+averageSalary);*/

        //Check if Any Employee Salary > 45000 (anyMatch)
//       Boolean anyHighSalary= list.stream().anyMatch(e->e.salary>45000);
//        System.out.println("Salary is Greater > 45000:"+anyHighSalary);

        //Employees Whose Salary > 30000
        // list.stream().filter(e->e.salary>30000).forEach(i-> System.out.println(i));

         // Sort Employees by Salary (ASC & DESC)
       /* list.stream()
                .sorted((e1,e2)->Double.compare(e1.salary,e2.salary))
                .forEach(System.out::println);*/

        // Second-Highest Salary (Interview Favorite ⭐)

       Employees seocndHighest= list.stream()
                .sorted((e1,e2)->Double.compare(e2.salary,e1.salary))
                .skip(1).findFirst().get();
        System.out.println("Second Highest Salary:"+seocndHighest);

        // Count Employees Salary < 30000
       Long count= list.stream().filter(e->e.salary<30000).count();
        System.out.println("Employee with salary < 30000 : "  +count);
    }
}
