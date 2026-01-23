package java8.Features.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example_06_startWith {
    static void main() {
        List<String> names= Arrays.asList("Spring","Java","Microservices","SpringBoot","python");
           names.stream()
                .filter(name -> name.startsWith("M"))
                .findFirst()
                .ifPresent(System.out::println);

    }
}
