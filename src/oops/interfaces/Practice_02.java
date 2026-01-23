package oops.interfaces;
interface Printable{
    void print();
}
class Documnet implements Printable{
    public void print(){
        System.out.println("Document Printing....");
    }
}
class Image implements Printable{
    public void print(){
        System.out.println("Image Printing..");
    }
}
public class Practice_02 {
    static void main() {
        Printable p1=new Documnet();
        p1.print();
        Printable p2=new Image();
        p2.print();
    }
}
