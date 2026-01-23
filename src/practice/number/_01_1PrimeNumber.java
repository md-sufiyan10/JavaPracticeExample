package practice.number;

import java.util.Scanner;

public class _01_1PrimeNumber {
    static void main() {
       Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        for (int i=0; i<t; i++){
           int n=scanner.nextInt();
            int count=0;
          for (int div=2 ;div*div <=n ; div++){
              if (n % div == 0) count++; break;
          }
            System.out.println(count==0 ? "Prime" : "Not Prime");
        }

    }
}
