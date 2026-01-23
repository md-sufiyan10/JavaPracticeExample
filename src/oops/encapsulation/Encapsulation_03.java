package oops.encapsulation;
class Employee{
     static String cName="Infosys";
     String name;
     int salary;

     void get(String s1, int s2){
         name=s1;
         salary=s2;
     }
     void show(){
         System.out.println("CityName:"+Employee.cName);
         System.out.println("Name:"+name);
         System.out.println("Salary:"+salary);
     }
     static int add(int a, int b){
         return a+b;
     }

}
public class Encapsulation_03 {
    static void main() {
        Employee e=new Employee();
        e.get("Sufiyan",12000);
        e.show();
      int r=  Employee.add(10,20);
        System.out.println("Result:"+r);

    }
}
