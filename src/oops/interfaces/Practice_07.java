package oops.interfaces;
interface MyInterface{
    void show();
}
class Temp{
    public void show(){
        System.out.println("Temp : ");
    }
}
class Children extends Temp implements MyInterface{
    public String toString(){
        return "Hello";
    }
}
public class Practice_07 {
    static void main() {
        MyInterface m=new Children();
        m.show();
        System.out.println(m.toString());
    }
}
