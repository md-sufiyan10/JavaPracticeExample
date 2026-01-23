package java8.Features.Basic;

import java.util.Arrays;
import java.util.List;

public class Example_03_Dublicate {
    static void main() {
            List<String> list= Arrays.asList("Java","Spring","Microservice","Hibernate","Java","API","Spring");
            list.stream().distinct().forEach(i-> System.out.println(i));
    }
}
