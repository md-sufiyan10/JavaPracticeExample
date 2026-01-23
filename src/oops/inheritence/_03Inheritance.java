package oops.inheritence;
class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child2 extends Parent {
    @Override
    void show() {
        System.out.println("Child show");
    }
}

public class _03Inheritance {
    static void main() {
        Parent p=new Child2();
        p.show();
       Child2 c=new Child2();
        c.show();
    }
}
