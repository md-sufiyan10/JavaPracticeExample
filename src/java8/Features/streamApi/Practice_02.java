package java8.Features.streamApi;

import java.util.Arrays;
import java.util.List;

public class Practice_02 {
    static void main() {
        List<String>  name= Arrays.asList("Anushka","Sufiyan","Anjum","Yaver","Khus","Najju","Asif");
        name.stream().filter(i->i.startsWith("A")).forEach(i-> System.out.println(i));
    }
}
