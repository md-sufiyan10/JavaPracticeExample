package pattern.number;

//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5

public class Pattern_01 {
    static void main() {
        for (int i=1; i<=5 ; i++){
            for (int j=1 ; j <=5 ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
