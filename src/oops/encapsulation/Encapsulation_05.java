package oops.encapsulation;

class Empl1{
    static String name="TCS";
    String name1;
    int salary1;

    void get1(String s1 , int s2){
        name1 =s1;
        salary1=s2;
    }
    void show(){
        System.out.println("CityName:"+name);
        System.out.println("Salary:"+salary1);
        System.out.println("CityName:"+name1);
    }
    static int add(int a, int b){
        return a+b;
    }
}
public class Encapsulation_05 {
    static void main() {
        Empl1 e1=new Empl1();
        System.out.println(e1.hashCode());
        System.out.println(e1);   // printing reference ID
        e1.name1="Lalu";
        System.out.println("Name:"+e1.name1);

        Empl1 e2=e1; // copy reference ID
        System.out.println("HashCode:"+e2.hashCode());
        System.out.println(e2);
         e2.name1="Bhalu";
         System.out.println("NameUpdate:"+e1.name1);

    }
}
