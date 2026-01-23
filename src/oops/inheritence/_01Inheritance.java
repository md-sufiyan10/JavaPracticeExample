package oops.inheritence;

class Base{
    private int x=10;

    void show(){

        System.out.println("print x value:"+x);
    }
}
class Child extends Base{
}
public class _01Inheritance {
    static void main() {
        Child c=new Child();
        c.show();
    }
}
