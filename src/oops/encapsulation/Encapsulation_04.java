package oops.encapsulation;

class Emplo{
    static String cName="TCS";
    String name;
    int salary;

    void get(String n , int s){
       name=n;
       salary=s;
    }
    void show(){
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("CityName:"+cName);
    }
    static int add(int a ,int b){
        return a+b;
    }
}
public class Encapsulation_04 {
    static void main() {
        Emplo e1 = new Emplo();
        e1.get("Sufiyan", 12000);
        e1.show();
        // System.out.println(cName);

        int z = Emplo.add(12, 20);
        System.out.println("Addition:" + z);
        System.out.println("CName:" + Emplo.cName);
        // z=add(10,20);
        // System.out.println(z);
    }
}
    class Demo
    {
        static void main(String[] args) {
            Emplo e2=new Emplo();
            e2.get("Khan",100);
            e2.show();
            int z=Emplo.add(20,30);
            System.out.println("Addition Two No:"+z);
            System.out.println("City_Name:"+Emplo.cName);
        }
    }

