package pattern.star;
//            * * * * *
//              * * * *
//                * * *
//                  * *
//                    *
public class Pattern_06Reversed_Mirror_RAT {
    static void main() {
        // outer loop for print number of rows:
        for (int i=1 ; i<=5 ;i++){
            // inner loop for print spaces:
            for (int j=2 ; j<=i ; j++){
                System.out.print(" ");
            }
            // inner loop print star * :
            for (int k=5 ; k>=i ; k--){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
