package pattern.number;

//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1

public class Pattern_08 {
    static void main() {
        for (int i=1; i<=5; i++){
            for (int j=1 ; j<=5 ; j++){
                 int k=j%2;
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}
