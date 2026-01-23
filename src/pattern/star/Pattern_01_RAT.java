package pattern.star;

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
public class Pattern_01_RAT {
    static void main() {
        for (int i=1; i<=5;i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
