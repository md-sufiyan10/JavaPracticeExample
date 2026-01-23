package java8.Features.FunctionalInterface;

import java.util.function.Function;

public class _08Function {
    static void main() {
       Function<String, Integer> f= name-> name.length();
        System.out.println( f.apply("Sufiyan"));
        System.out.println( f.apply("Bili"));
    }
}
