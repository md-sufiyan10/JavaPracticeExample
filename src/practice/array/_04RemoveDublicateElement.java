package practice.array;

import java.util.HashSet;
import java.util.Set;

public class _04RemoveDublicateElement {
    static void main() {
        int arr[]= {3,4,5,6,3,5,7};
        int[] uniqueValue=removeDublicateElement(arr);
        System.out.println("Arrays with dublicate Element:");
        for (int num : uniqueValue){
            System.out.print (num+" ");
        }
    }

    public static int[] removeDublicateElement(int[] array){
        Set<Integer> set=new HashSet<>();
        for (int num : array){
            set.add(num);
        }
        int[] result=new int[set.size()];
        int i=0;
        for ( int num : set){
            result[i++]=num;
        }
        return result;
    }
}
