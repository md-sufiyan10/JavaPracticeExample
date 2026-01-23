package java8.Features.FunctionalInterface;

import java.util.function.Function;

public class _03FunctionInterfaceWithoutLambda {
    static void main() {
        // Function to find square of the number using Anonymus class
        // its take one argument and produce result
        Function<Integer,Integer> square= new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer* integer;
            }
        };
        // Test Numbers

        System.out.println("Square of the Number 5 is :"+square.apply(5));
        System.out.println("Square of the Number 9 is :"+square.apply(9));
    }
}
