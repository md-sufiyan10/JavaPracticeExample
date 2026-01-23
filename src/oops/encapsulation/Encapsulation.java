package oops.encapsulation;

class Student{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
    }
}
public class Encapsulation {
    static void main() {
       Student student=new Student();
       student.setName("Ravi");
       student.setAge(29);
       IO.println("Name:"+student.getName());
       IO.println("Age:"+student.getAge());
    }
}
