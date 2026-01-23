package java8.Features.StaticMethod;
interface Interface{
    public void method1();

   static void method2(){
       System.out.println("Static Method Inside interface.");
    }
}
class myClass implements Interface{
    @Override
    public void method1() {
        System.out.println("Implementation of Abstract method.");
    }
}
public class _01StaticMethod {
    static void main() {
     myClass m=new myClass();
     m.method1();    // calls implemented abstract method
        Interface.method2(); // calling static method using InterfaceName
    }
}
