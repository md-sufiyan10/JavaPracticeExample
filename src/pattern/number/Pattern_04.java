package pattern.number;

//        1 1 1 1 1
//        0 0 0 0 0
//        1 1 1 1 1
//        0 0 0 0 0
//        1 1 1 1 1

public class Pattern_04 {
    static void main() {

        for (int i=1; i<=5;i++){
            int k= i%2;
            for (int j=1; j<=5 ; j++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
