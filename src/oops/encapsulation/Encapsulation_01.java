package oops.encapsulation;
class Company
{
    String name;
     int salary;
     void get(String name, int salary)
     {
         this.name=name;
         this.salary=salary;
     }
     void dispaly(){
         System.out.println("Name:"+name);
         System.out.println("Salary:"+salary);
     }
}
public class Encapsulation_01 {
    static void main() {
        Company c=new Company();
         c.get("Sufiyan",12000);
         c.dispaly();
    }
}
