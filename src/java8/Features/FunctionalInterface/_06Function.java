package java8.Features.FunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

class Student{
    int id;
    String name;
    String course;
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}
public class _06Function {
    static void main() {
        Map<Integer,Student> studentMap=new HashMap<>();
        studentMap.put(101 , new Student(101,"Rahul","Java"));
        studentMap.put(102,new Student(102,"Anita","Python"));
        studentMap.put(103, new Student(103,"Mukesh","DataBase"));

        // function to retrieve student based on student id

        Function<Integer,Student> getStudentById= id->studentMap.get(id);
        // Retrieve and print student Detail

          Student student= getStudentById.apply(102);
        System.out.println(
                "ID :" + student.id +
                ",Name :"+ student.name +
                ",Course : "+student.course
        );
    }
}
