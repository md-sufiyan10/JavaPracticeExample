package pattern.number;
//           5 4 3 2 1
//           5 4 3 2 1
//           5 4 3 2 1
//           5 4 3 2 1
//           5 4 3 2 1

public class Pattern_07 {
    static void main() {
        for (int i=1; i<=5 ; i++){
            for (int j=5; j>=1 ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
