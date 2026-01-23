package java8.Features;
import java.util.Scanner;
public class MyServices
{
    static void main()
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter User Id:");
                int userId= sc.nextInt();
                  user u=new user();
                  String userName=  u.getUserNameById(userId);
                  if(userName != null)
                  {
                      String msg=userName.toUpperCase()+ " , Hello";
                      System.out.println(msg);
                  }else
                      System.out.println("Invalid ID: ");
    }
}
