package java8.Features.Lambda;

import java.util.function.Predicate;

public class LambdaExample_01 {

    static void main() {
        String names[] = {"Anuska", "Anurdha", "Anjum", "Deepika", "Bilkish", "Waseema"};
        // start characer with A using lambda expression
        Predicate<String> p = name -> name.charAt(0) == 'A';
        for (String name:names){
            if (p.test(name)){
                System.out.println(name);
            }
        }
    }

}
