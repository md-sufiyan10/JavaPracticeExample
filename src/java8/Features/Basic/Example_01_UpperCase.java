package java8.Features.Basic;

import java.util.Arrays;
import java.util.List;

public class Example_01_UpperCase {
    static void main() {
     List<String> list= Arrays.asList("Java","Spring","MicroServices","React","js");
     list.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
