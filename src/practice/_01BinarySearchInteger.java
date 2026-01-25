package practice;
 public class _01BinarySearchInteger {
     static void main() {
         int[] arr = {10, 20, 30, 40, 50};
          int li=0;
          int hi=arr.length-1;
          int key=30;
          boolean found=false;
          while (li<hi){
              int mid=(li+hi)/2;
              if (arr[mid]==key){
                  System.out.println("Element fount at Index is :"+mid);
                  found=true;
                  break;
              }
              if (key>arr[mid])
                  li=mid+1;
              else
                  hi=mid-1;
          }
          if (!found)
              System.out.println("Element is not found at Given Index:");

     }

}
