package finalKeyword;

class B{
    final int X=this.getX();

    int getX()
    {
        System.out.println(X + " via Get Function:");
        return 10;
    }
    B()
    {
      // X=getX();
        System.out.println(this.X + " via Constructor:");
    }
}
public class Test_01 {
    static void main() {
        new B();
    }
}
