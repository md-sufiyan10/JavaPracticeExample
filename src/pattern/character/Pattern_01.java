package pattern.character;

import java.io.IOException;

//A
//B B
//C C C
//D D D D
//E E E E E

public class Pattern_01 {
    static void main() throws IOException {
        char input, alphabet='A';
        System.out.println("Enter an Uppercase Character you want to print in the last row: ");
         int x= System.in.read();
         input= (char)x;
        for (int i=1; i<=(input-'A'+1) ; ++i){
            for (int j=1; j<=i ; ++j){
                System.out.printf( " %c" , alphabet );
            }
            alphabet++;
            System.out.println();
        }
    }
}
