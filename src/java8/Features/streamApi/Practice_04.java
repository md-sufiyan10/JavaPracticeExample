package java8.Features.streamApi;

import java.util.Arrays;
import java.util.List;

public class Practice_04 {
    static void main() {
        List<String> name= Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");
       /* for (String n : name){
            System.out.println(n.toUpperCase());
        }*/
      //  System.out.println("===============================");
       /* name.stream().map(n->n.toUpperCase()).forEach(n-> System.out.println(n));

        name.stream().mapToInt(n->n.length()).forEach(i-> System.out.println(i));*/

        // print name with its length which are starting with 'A' using Stream API

        name.stream().filter(s->s.startsWith("A"))
                .map(n-> n +" - "+n.length())
                .forEach(n-> System.out.println(n));
    }
}
