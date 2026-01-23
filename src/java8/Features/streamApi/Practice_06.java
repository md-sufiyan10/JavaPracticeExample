package java8.Features.streamApi;

import java.util.Arrays;
import java.util.List;

public class Practice_06 {
    static void main() {
        List<String> javacources= Arrays.asList("corejava","advjava","Springboot","restapi","Microservice");
        javacources.stream().limit(3).forEach(i-> System.out.println(i));
        System.out.println("---------------------");
        javacources.stream().skip(3).forEach(i-> System.out.println(i));
        System.out.println("---------------------------");
        List<String> name=Arrays.asList("Raza","Rani","Yonus","Anjum","Rani","Raza");
        name.stream().distinct().forEach(i-> System.out.println(i));
    }
}
