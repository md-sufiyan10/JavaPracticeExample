package assignment_01;

import java.util.Scanner;

public class _03ShopDiscoutDetails {
    static void main() {

        int costPerUnit=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Quantity..");
        int quantity=sc.nextInt();

        // calculate total cost
        int total_cost=quantity*100;

        double finalAmount;
        // Apply discount
        if (total_cost>1000){
            double discount= total_cost * 0.10; // 10% discount
            finalAmount= total_cost-discount;
            System.out.println("Discount Applied Susseccfully..."+finalAmount);
        }
      else {
          finalAmount=total_cost;
            System.out.println("No Discount Applied..");
        }
    // Result
        System.out.println("Total cost before discount:"+total_cost);
        System.out.println("Final Amount :"+finalAmount);
    }
}
