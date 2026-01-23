package practice.array;

public class _07AveragePositiveNumber {
    static void main() {
        int arr[] = {-3, 0, -2, 12, -7, 25, -11};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = (sum + arr[i]);
                count++;
            }
        }
        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Average of the Posiive Number is:" + avg);
        } else {
            System.out.println("Not Positive Number:");  // 4+8 /2 =6
        }
    }
}
