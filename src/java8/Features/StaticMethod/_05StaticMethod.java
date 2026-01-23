package java8.Features.StaticMethod;
class parent{
    static void show(){
        System.out.println("Parent Call Method Show:");
    }
}
class Child extends parent{
    static void show(){
        System.out.println("Child Call Methodd Show.");
    }
}
public class _05StaticMethod {
    static void main() {
    parent p=new Child();
     p.show();

     /* What happens internally?
     * Compiler checks: Parent has show() ✔
     * JVM sees object is Child
     * JVM calls Child.show()
     * SO : ✔ This is runtime polymorphism
       */
    }
}
