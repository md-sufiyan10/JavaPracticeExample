
package oops.inheritence;
class Parent4
{
    Parent4()
    {
        System.out.println("Parent Constructor");
    }
}

class Child4 extends Parent4
{
    Child4()
    {
        super();
        System.out.println("Child Constructor");


    }
}
public class _04Inheritence {
    public static void main(String[] args) {
        Child4 c=new Child4();
    }
}
