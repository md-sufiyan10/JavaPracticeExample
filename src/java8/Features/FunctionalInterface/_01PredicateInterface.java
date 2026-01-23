package java8.Features.FunctionalInterface;

import java.util.function.Predicate;

public class _01PredicateInterface {
    static void main() {
    // predicate to check if a number is even using Anonymous class

        Predicate<Integer> isEven= new Predicate<Integer>() {
            @Override
            public boolean test(Integer a) {
                return a % 2 == 0;
            }
        };
        // test number
        System.out.println("Is 4 is Even:"+isEven.test(4));
        IO.println("Is 7 is Even :"+isEven.test(7));
    }
}
