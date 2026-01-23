package java8.Features.Basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Example_11_SumAvg {
    static void main() {
        List<Integer> list= Arrays.asList(5,8,12,20,40,32);
          int sum=  list.stream().mapToInt(Integer::intValue).sum();

         /* OptionalDouble avg= list.stream()
                  .mapToInt(Integer::intValue)
                  .average();*/
       double avg= list.stream().mapToInt(Integer::intValue).average().orElseThrow();
        System.out.println("Sum :"+sum);
        System.out.println("Average :"+avg);

        System.out.println("---------------------------");
        IntSummaryStatistics Stat =   list.stream()
                .mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Sum :"+Stat.getSum());
        System.out.println("Average :"+Stat.getAverage());

    }
}
