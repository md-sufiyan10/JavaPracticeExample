package java8.Features.Basic;

import java.util.Arrays;
import java.util.List;

public class Example_07_Length {
    static void main() {
        List<String> name= Arrays.asList("Java","pyhton","Spring");
            name.stream()
                .forEach(n-> System.out.println(n +" - "+n.length()));
        System.out.println("------------------------------");
        name.stream().map(n->n+" - "+n.length()).forEach(System.out::println);
        System.out.println("====================");
              name.stream()
                .map(n -> String.format("%s - %d", n, n.length()))
                .forEach(System.out::println);

    }
}
