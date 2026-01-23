package java8.Features.FunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class _05SuplierDemo {
    static void main()
    {
        Supplier<String> s= ()->
        {
            Random random = new Random();
           String otp= "";
           for (int i=1 ; i<=5 ; i++){
               otp=otp+ random.nextInt(10);
            }
           return otp;
        };
        System.out.println("Generated Value:"+ s.get());
        System.out.println("Generated Value:"+ s.get());
        System.out.println("Generated Value:"+ s.get());

    }
}
