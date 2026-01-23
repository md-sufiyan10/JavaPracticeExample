package java8.Features.Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example_10_SortAscDescOrder {
        static void main() {
        List<Integer> list= Arrays.asList(12,90,30,20,10,50,20);
        list.stream().distinct().sorted().forEach(System.out::println);

        System.out.println("---------------------------");
        /*list.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);*/
         List<Integer> sortedDesc=   list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
            System.out.println("Descending Order:"+sortedDesc);
            System.out.println("---------------");
           List<Integer> sortedDes= list.stream().distinct()
                          .sorted((a,b)->b.compareTo(a)).toList();
            System.out.println("Descending Order:"+sortedDes);

        System.out.println("======================");
        List<Integer> sorted= list.stream().distinct().sorted().collect(Collectors.toList());   // Asseccending order
            System.out.println("Ascending Order:"+sorted);




    }
}
