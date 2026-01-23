package java8.Features.Basic;

import java.util.Arrays;
import java.util.List;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id , String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}
public class CustomsEmployee {
    static void main() {
        Employee e1=new Employee(101,"Sufiyan",12000);
        Employee e2=new Employee(102,"Anuj",20000);
        Employee e3=new Employee(103,"Anjum",25000);
        Employee e4=new Employee(104,"Yaver",30000);
        Employee e5=new Employee(105,"Revanth",40000);

        List<Employee> employees=Arrays.asList(e1,e2,e3,e4,e5);
        


    }
}
