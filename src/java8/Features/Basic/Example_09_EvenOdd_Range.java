package java8.Features.Basic;

import java.util.stream.IntStream;

public class Example_09_EvenOdd_Range {
    static void main() {
        int start=1; int end=10;
        System.out.println("Even Number:");
       IntStream.range(start,end)
               .filter(n->n%2==0)
               .forEach(System.out::println);

        System.out.println("Odd Number:");
        IntStream.rangeClosed(start,end)
                .filter(n->n%2!=0)
                .forEach(System.out::println);

        System.out.println("---------------------------");
        IntStream.rangeClosed(1,10)
                .forEach(n-> System.out.println(n+ " - " +(n % 2==0 ? "Even ":  "Odd")));
    }
}
