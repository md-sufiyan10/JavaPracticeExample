package oops.interfaces;

import java.util.Scanner;

interface Payment{
    void pay();
}
class UpiPayment implements Payment{
    public void pay(){
        System.out.println("Payment done using UPI.....");
    }
}
class NetBankingPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment done using NetBanking");
    }
}
class PaymentCheck{
    void payment(Payment payment){
        payment.pay();
    }
}
public class Practice_04 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        PaymentCheck check=new PaymentCheck();
        System.out.println("Choose Payment Mood....");
        System.out.println("1 . UPI");
        System.out.println("2 . NetBanking ");
        System.out.println("Enter Choice...");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1 :
                check.payment(new UpiPayment());
                break;
            case 2:
                check.payment(new NetBankingPayment());
                break;
            default:
                System.out.println("Invalid choice....");


        }
    }
}
