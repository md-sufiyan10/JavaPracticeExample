package java8.Features.FunctionalInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class _09ConsumerInterface {
    void main(String...s)
    {
        ArrayList<Integer> al=new ArrayList();
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(7);
        //  System.out.println("Before Sort Number:"+al);

    //    Collections.sort(al, new NumberCompare());
    //    Collections.sort(al, (i,j)->i.compareTo(j));  // Assecnding order
//        Collections.sort(al, (i,j)->(i>j) ? -1 : 1);  // desending order
//        System.out.println("After Sort Number:"+al);

        System.out.println("===Print Using for loop====");
        for(int i=0; i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println("\n"+"====using for Each===");
        for (int i : al){
            System.out.print(i+" ");
        }
        System.out.println("\n"+"====using forEach(Consumer)===");

        al.forEach(i-> System.out.print(i+" "));
    }


}

