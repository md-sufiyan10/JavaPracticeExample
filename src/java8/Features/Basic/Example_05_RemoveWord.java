package java8.Features.Basic;

    import java.util.Arrays;
    import java.util.List;

public class Example_05_RemoveWord {
    static void main() {
        List<String>  list= Arrays.asList("Spring","Java","Microservices","SpringBoot","python");
       List<String> removeString= list.stream().filter(n-> !n.startsWith("S")).toList();
        System.out.println("Remove String with Start S:"+removeString);
    }
}
