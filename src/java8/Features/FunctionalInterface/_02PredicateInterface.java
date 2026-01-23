package java8.Features.FunctionalInterface;

import java.util.function.Predicate;

public class _02PredicateInterface {
    static void main() {
        // predicate checking is Even Number using lambda expression
        Predicate<Integer> isEven= x->x%2==0;
        // Test Number
        IO.println("Is 4 Even ?"+isEven.test(4));
        System.out.println("Is 5 is Even ?"+isEven.test(5));

    }
}
