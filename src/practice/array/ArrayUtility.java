package practice.array;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Plz enter the number of the Element: ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        int i=0;
        while(i<size){
            System.out.println("Please enter element no "+(i+1) +": ");
            nums[i]=sc.nextInt();
            i++;
        }
        return nums;

}

 public static int[][] input2DArray(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:");
     int rows=sc.nextInt();
     System.out.println("Enter no of columns:");
     int columns=sc.nextInt();

     int[][] newArray=new int[rows][columns];
     int i=0;
     while(i<rows){

         int j=0;
         while(j<columns){
             System.out.println("Please enter the element row :"+(i+1) +" , column :"+(j+1)+ " :");
             newArray[i][j]= sc.nextInt();
             j++;
         }
         i++;
     }
     return  newArray;
 }

    // Method to print array elements
    public static void printArray(int[] nums) {
      int i=0;
      while(i<nums.length){
          System.out.print(nums[i]+" ");
      }
        System.out.println();
    }
}
