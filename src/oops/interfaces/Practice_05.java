package oops.interfaces;

interface My{
    void show();
}
interface My1{
    void display();
}
class Child implements My,My1{
    public void show(){
        System.out.println("Show ");
    }
    public void display(){
        System.out.println("Display");
    }
}
public class Practice_05 {
    static void main() {
        /*Child c=new Child();
        c.show(); c.display();
        System.out.println("--------------------");
        My m=new Child();
        m.show();
        System.out.println("---------------------");
        My1 mr=new Child();
        mr.display();*/

    }
}
