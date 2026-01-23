package pattern.number;

//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5

public class Pattern_02 {
    static void main() {
        for (int i=1; i<=5 ; i++){
            for (int j=1; j<=5 ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
