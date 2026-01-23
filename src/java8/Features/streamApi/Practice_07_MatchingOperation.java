package java8.Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.StreamSupport.stream;

class Person{
    String name;
    String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
public class Practice_07_MatchingOperation {
    static void main() {
        Person p1=new Person("Sufiyan","INDIA");
        Person p2=new Person("Revanth","USA");
        Person p3=new Person("Panday","PAKISTAN");
        Person p4=new Person("Umar","KANADA");
        Person p5=new Person("Kumar","INDIA");

        List<Person> name= Arrays.asList(p1,p2,p3,p4,p5);
      /* Boolean status1= name.stream().anyMatch(n->n.country.equals("INDIA"));
        System.out.println("Any Person available inIndia::"+status1);

       Boolean status2= name.stream().anyMatch(a->a.country.equals("UKA"));
        System.out.println("Any UKA available?::"+status2);

        Boolean status3=name.stream().noneMatch(n->n.country.equals("RASIYA"));
        System.out.println("Doesn't Belongs to RASIYA:"+status3);
        Boolean status4 =name.stream().allMatch(n->n.country.equals("INDIA"));
        System.out.println("All Person from India?::"+status4);*/

        /*List<Person> persons= Arrays.asList(p1,p2,p3,p4);
        Optional<Person> findFirst= persons.stream()
                                    .filter(n->n.country.equals("INDIA"))
                                    .findFirst();
                                    //  .findAny();
        if (findFirst.isPresent())
            System.out.println(findFirst.get());
        else
            System.out.println("Information is Not Available:");*/

//        List<Person> persons= Arrays.asList(p1,p2,p3,p4,p5);
//       List<Person> indians=persons.stream().filter(n->n.country.equals("INDIA"))
//                       .collect(Collectors.toList());
//
//        indians.forEach(i-> System.out.println(i));
      // collect names of persons who are belongs to india and store into names collection
        List<Person> persons= Arrays.asList(p1,p2,p3,p4,p5);
        List<String> names = persons.stream()
                .filter(p -> p.country.equals("INDIA"))
                .map(p -> p.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
