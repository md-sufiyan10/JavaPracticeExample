package java8.Features.StaticMethod;

interface Constant{
    int MAX=100;    // public static final by default
    public int MIN=0;
    static int vlaue=40;
    final double salary=12200.90;

    public static final int re=2000;
    static void printMax(){
        System.out.println("Maximum Value:"+MAX);
        System.out.println("Minimum Value:"+MIN);
        System.out.println("Static:"+Constant.vlaue);
        System.out.println("Final Salary:"+salary);
        System.out.println("All Concept:"+re);
    }
}
public class _04StaticMethod {
    static void main() {
     Constant.printMax();
    }
}
