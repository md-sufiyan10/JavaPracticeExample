package java8.Features.FunctionalInterface;

import java.util.function.Function;

public class _04FunctionInterfaceWithLambda {
    static void main() {
        Function<Integer,Integer> squareResult= x-> x*x;
        System.out.println("Square 9 is:"+squareResult.apply(9));
        System.out.println("Square 5 is:"+squareResult.apply(5));
    }
}
