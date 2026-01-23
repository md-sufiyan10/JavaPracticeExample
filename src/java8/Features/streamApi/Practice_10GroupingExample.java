package java8.Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Empl{
    String name ;
    String country;
    double salary;

    public Empl(String name, String country, double salary) {
        this.name = name;
        this.country = country;
        this.salary = salary;
    }
    public String toString() {
        return name + " - " + country + " - " + salary;
    }
}
public class Practice_10GroupingExample {
    static void main() {
        List<Empl> list= Arrays.asList(
                new Empl("Sufiyan","USA",20000),
                new Empl("Ashok", "INDIA", 50000),
                new Empl("Kumar", "INDIA", 60000),
                new Empl("Ching", "CHINA", 70000),
                new Empl("John", "USA", 80000));
/*
       Map<String, List<Empl>> empByCountry= list.stream()
                             .collect(Collectors.groupingBy(e->e.country));
        System.out.println(empByCountry);*/
        // Group By + Count (How many employees per country)

       Map<String ,Long> countByCountry=list.stream()
               .collect(Collectors.groupingBy(e->e.country,Collectors.counting()));
        System.out.println(countByCountry);

        // Group By + Average Salary (Very Important ⭐)
        Map<String, Double> avgSalaryByCountry =
                list.stream()
               .collect(Collectors.groupingBy(e->e.country,Collectors.averagingDouble(e->e.salary)));
        System.out.println(avgSalaryByCountry);


    }
}
