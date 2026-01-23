package superKeyword;
class Base{
   int x=10;

}
class Child extends Base{
    int x=20;
    void show(){
        System.out.println("X value:"+x);
        System.out.println(super.x);
    }
}
public class DataHiding {
    static void main() {
        Child c=new Child();
        c.show();
    }
}
