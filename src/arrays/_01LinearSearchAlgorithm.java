package arrays;

public class _01LinearSearchAlgorithm {
    static void main() {
        int[] arr={3,5,6,8,12,23,7};
        int target=27;
        boolean found=false;

        for (int i=0 ;i<arr.length ; i++){
            if (arr[i] == target){
                System.out.println("Element foud at Index :"+i);
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Element is Not Found:");
        }
    }
}
