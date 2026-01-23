package pattern.star;
//                 *
//               * *
//             * * *
//           * * * *
//         * * * * *

public class Pattern_05_Mirrored_RAT {
    static void main() {
        // outer loop print number of rows
        int n = 5;
      for (int i=1 ; i<=n ;i++)
      {
           // inner loop print spaces
          for (int j=4; j>=i;j--)
          {
              System.out.print(" ");
          }
          // Inner loop for print Star * in each row:
          for (int k=1; k<=i ; k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }

    }
}
