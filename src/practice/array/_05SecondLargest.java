package practice.array;

public class _05SecondLargest {
    static void main() {
        int[] arr={3,5,6,7,9,8};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int num : arr){
            if(first > num){
                    second=first;
                    first=num;
            } else if (num > second && num!=first){
                second=num;
            }
        }
        IO.println("Second largest :"+second);
    }
}
