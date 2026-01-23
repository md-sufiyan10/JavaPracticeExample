package java8.Features.DefaultMethod;

interface MyInterface{
    void m1();
    default void m2(){
        IO.println("Default method inside interface.");
    }
}
class MyClass implements MyInterface{
    @Override
    public void m1() {
        MyInterface.super.m2();
        System.out.println("Implementaion abstarct Method.");
        MyInterface.super.m2();
    }

    /*@Override
    public void m2() {
        System.out.println("Overirde default method");
        MyInterface.super.m2();
    }*/
}
public class _01DefaultMethod {
    static void main() {
    MyInterface m=new MyClass();
        m.m1();
      //  m.m2();
    }
}
