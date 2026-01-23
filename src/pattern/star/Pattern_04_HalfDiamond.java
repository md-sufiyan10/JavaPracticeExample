package pattern.star;
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
public class Pattern_04_HalfDiamond {
    static void main() {
        for (int i=1; i<=5 ; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }

            System.out.println();
        }
        for (int i=1; i<=4 ; i++)
        {
            for (int j=4; j>=i ;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
