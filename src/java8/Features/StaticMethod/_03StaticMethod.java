package java8.Features.StaticMethod;

interface vehicle{
    static void engineType(){
        System.out.println("Perol Engine");
    }
}
class Car implements vehicle{
    static void engineType(){   // This is not Overriding , its seprate Method
        System.out.println("Diesel Engine");
    }
}
public class _03StaticMethod {
    static void main() {
     vehicle.engineType();  // petrol engine
     Car.engineType();    // Diesel engine
       // vehicle c = new Car();
       // c.engineType    compile time error Static method cant be accessed via Object

    }
}
