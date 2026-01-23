package java8.Features.streamApi;

import java.util.stream.Stream;

class Employee{
    String name;
    int age;
    double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class Practice_05 {
    static void main() {
        Employee e1=new Employee("Sufiyan",23,2000);
        Employee e2=new Employee("Kundan",20,2200);
        Employee e3=new Employee("Anjum",32,26000);
        Employee e4=new Employee("Bilkish",29,2900);
        Employee e5=new Employee("Usman",21,30000);
        Stream<Employee> stream=Stream.of(e1,e2,e3,e4,e5);

       /* stream.filter(e->e.salary>=2200)
                .map(name->name.name +":"+name.age)
                .forEach(n-> System.out.println(n));*/
        System.out.println("======================");
        stream.filter(e->e.salary>2200)
                .forEach(n-> System.out.println(n.name+" -- "+n.age));
    }
}
