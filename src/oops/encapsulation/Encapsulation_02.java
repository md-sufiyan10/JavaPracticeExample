package oops.encapsulation;
class Empl{
    static String cName="TCS";
    String name;
    int salary;

    public Empl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class Encapsulation_02 {
    static void main() {
        Empl e1=new Empl("Sufi",1200);
        Empl e2=new Empl("Khan",1000);

        System.out.println("CityName:"+Empl.cName);
        System.out.println("Name:"+e1.name);
        System.out.println("Salary:"+e1.salary);

        System.out.println("----------------------------");

        System.out.println("CityName:"+Empl.cName);
        System.out.println("Name:"+e2.name);
        System.out.println("Salary:"+e2.salary);

    }
}
