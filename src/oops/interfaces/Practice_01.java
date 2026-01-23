package oops.interfaces;

interface vehicle{
    void shart();
    void shop();
}
class Car implements vehicle{
    public void shart() {
        System.out.println("Starting....");
    }

    public void shop() {
        System.out.println("Stopinh..");
    }
}
public class Practice_01 {
    static void main() {
        vehicle v=new Car();
        v.shart(); v.shop();
    }
}
