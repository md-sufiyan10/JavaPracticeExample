package finalKeyword;

public class InstanceFinalVariable {
    final  int x=10;
    static void main() {
        InstanceFinalVariable t=new InstanceFinalVariable();
       // t.x=t.x+20;
        System.out.println(t.x);
        InstanceFinalVariable t1=new InstanceFinalVariable();
        // t1.x=t1.x+20;
        System.out.println(t1.x);
    }
}
