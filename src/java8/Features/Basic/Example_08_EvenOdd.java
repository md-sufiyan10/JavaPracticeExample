package java8.Features.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example_08_EvenOdd {
    static void main() {
        List<Integer> list=Arrays.asList(3,5,7,8,10,12,20);
        list.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
        System.out.println("--------------------------");
        list.stream().filter(n->n%2!=0).forEach(System.out::println);
        System.out.println("---------------------");
        list.stream().forEach(n-> System.out.println(n+" - " +(n%2==0 ? "Even" : "Odd")));
    }


}
