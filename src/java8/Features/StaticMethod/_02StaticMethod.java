package java8.Features.StaticMethod;
interface Calculator{
    public static int Add(int a, int b){
        return a+b;
    }
    static int Add(int a, int b, int c){
        return a+b+c;
    }
}
public class _02StaticMethod {
    static void main() {
     int result= Calculator.Add(10,20);
        System.out.println("Addition two Number:"+result);
     int sumThree=Calculator.Add(10,20,30);
        System.out.println("Addition three Number:"+sumThree);
    }
}
