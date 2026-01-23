package java8.Features.FunctionalInterface;

// Take a list of persons and print the persons whose age is ≥ 18 using Lambda Expression

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
    String name;
    int age;

    Person( String name , int age){
        this.name=name;
        this.age=age;
    }
}


public class _04PredicateExample {
    static void main() {
      /*  Person p1=new Person("Jon",21);
        Person p2=new Person("Roy",12);
        Person p3=new Person("Mohan",27);
        Person p4=new Person("Kiran",10);
        List<Person> persons= Arrays.asList(p1,p2,p3,p4);
        Predicate<Person> predicate=p->p.age>=18;
        for (Person person: persons){
            if (predicate.test(person)){
                System.out.println("Name:"+person.name +"Age:" +person.age);
            }
        }*/

        List<Person> persons=new ArrayList<>();
                 persons.add(new Person("Sufi",23));
                 persons.add(new Person("Anjum",12));
                 persons.add(new Person("Khan",22));
                 persons.add(new Person("AlisbaAppi",10));

                 Predicate<Person> predicate=p->p.age>=18;

                /* persons.stream().filter(p->p.age>=18)
                         .forEach(p-> System.out.println("Name:"+p.name +" Age:"+p.age));*/

        persons.stream().filter(predicate)
                .forEach(p-> System.out.println("Name:"+p.name +" Age:"+p.age));
    }
}
