package assignment_01;

class A{
    A(){
        System.out.println("A Class");
    }
}
class B extends A{
    B(){
        System.out.println("B Class");
    }
}
class C extends A{
    C(){
        System.out.println("C class");
    }
}
public class ConstructorExample {
    static void main() {
      new C();
    }
}
