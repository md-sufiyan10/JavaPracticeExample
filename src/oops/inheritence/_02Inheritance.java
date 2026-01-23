package oops.inheritence;
class Base1{
    int x=20;
}
class Child1 extends Base1{
    int x=90;
    void show(){
        System.out.println(x);
       // System.out.println(super.x);
    }

}
public class _02Inheritance {
    static void main() {
        Child1 ch=new Child1();
        ch.show();

    }
}
