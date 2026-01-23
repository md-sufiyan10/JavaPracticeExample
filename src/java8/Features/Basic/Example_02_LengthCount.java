package java8.Features.Basic;

import java.util.Arrays;
import java.util.List;

public class Example_02_LengthCount {
    static void main() {
        List<String> list= Arrays.asList("Java","Spring","Microservice","Hibernate","Java","API","Streams");
      Long countLength=  list.stream().filter(i->i.length()>5).count();
        System.out.println("Length Count :: "+countLength);
    }
}
