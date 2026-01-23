package finalKeyword;

class B1{
    final int x;
    B1(int z){
         x=0 ; //(this line is inserted by the compiler)
        System.out.println(x); // error
       // x=z;
        System.out.println(x);
    }
}
public class Test_02 {
    static void main() {
        B1 b1=new B1(20);
        // b1.x=900;
        B1 b2=new B1(200);
    }
}
