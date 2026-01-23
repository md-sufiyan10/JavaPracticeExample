package java8.Features.Basic;

import java.util.Arrays;
import java.util.List;

public class Example_04_ContainsCheck {
    static void main() {
        List<String> list= Arrays.asList("Java","Spring","Microservice","Hibernate","Java","API","SpringBoot");
       List<String> result= list.stream().filter(name->name.contains("Spring")).toList();
        System.out.println(result);
    }
}
