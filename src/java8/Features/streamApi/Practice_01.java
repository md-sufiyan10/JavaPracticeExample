package java8.Features.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practice_01 {
    static void main() {
        List<Integer> list= Arrays.asList(10,30,45,45,12);
        // need reasult greater than 20 values

        /*for (Integer i : list){
            if (i>20){
                System.out.println(i);
            }
        }*/
       /* Stream<Integer> stream=list.stream();
        Stream<Integer>filterStream=  stream.filter(i->i>20);
        filterStream.forEach(i-> System.out.println(i));*/

        list.stream().filter(i->i>20).forEach(i-> System.out.println(i));
    }
}
