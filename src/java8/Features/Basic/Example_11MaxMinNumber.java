package java8.Features.Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Example_11MaxMinNumber {
    static void main() {
        List<Integer> list= Arrays.asList(12,45,90,21,34,58);
      /*int max=  list.stream().max(Integer::compareTo).orElseThrow();
      int min=  list.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Maximum Value:"+max);
        System.out.println("Minimum Value:"+min);*/

        System.out.println("===========================");
    int maximum= list.stream().collect(Collectors.maxBy(Integer::compareTo)).orElseThrow();
    int minimum = list.stream().collect(Collectors.minBy(Integer::compareTo)).orElseThrow();
        System.out.println("Maximum:"+maximum);
        System.out.println("Minimum:"+minimum);

        System.out.println("==================");
       int max= list.stream().reduce(Integer::max).orElseThrow();
       int min=list.stream().reduce(Integer::min).orElseThrow();
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);

     /*   System.out.println("--------------------------");
       IntSummaryStatistics state= list.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Maximum Number:"+state.getMax());
        System.out.println("Minimum Number:"+state.getMin());
        System.out.println("Average Number:"+state.getAverage());*/

        System.out.println("----------Second Highest---------------");

        /*int secondHighest=list.stream()
                              .distinct()
                              .sorted(Comparator.reverseOrder())
                              .skip(1).findFirst().orElseThrow();
       int secondMinimum= list.stream()
                        .distinct()
                        .sorted().skip(1).findFirst().orElseThrow();
        System.out.println(" 2nd HighestNumber:"+secondHighest);
        System.out.println(" 2nd Lowest Number:"+secondMinimum);*/
    }
}
