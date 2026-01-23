package oops.interfaces;
interface I1{
    void m1();
}
interface I2{
    void m2();
}
class A implements I1,I2{
    public void m1() {
        System.out.println("m1 method calll");
    }
    public void m2() {
        System.out.println("m2 call.");
    }
}
public class Practice_03MultipleInheritence {
    static void main() {
        A a=new A();
        a.m1();
        a.m2();
    }
}
