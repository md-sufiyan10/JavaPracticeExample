package java8.Features.streamApi;

import java.util.stream.Stream;

class User{
    String name;
    int age;

    public User( String name,int age) {

        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Practice_03 {
    static void main() {
        User u1=new User("Sufiyan",23);
        User u2=new User("revanth",28);
        User u3=new User("Anjum",19);
        User u4=new User("Anushka",21);
        User u5=new User("Khushuu",32);

        Stream<User> stream= Stream.of(u1,u2,u3,u4,u5);
       // stream.filter(a->a.age>20).forEach(c-> System.out.println(c));

        /*stream.filter(u->u.age>18 && u.name.startsWith("A"))
                .forEach(u-> System.out.println(u));*/

        stream.filter(u->u.age>18)
                .filter(u->u.name.startsWith("A"))
                .forEach(u-> System.out.println(u));
    }
}
