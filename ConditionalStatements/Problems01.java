package ConditionalStatements;

import java.util.Scanner;

public class Problems01 {
    public static void main(String[] args) {
     Scanner ss = new Scanner(System.in);
     System.out.print("Please Entry you order here = ");
     int x = ss.nextInt();
     if(x <= 70){
         System.out.println("Order Confirmed");
     }else{
         System.out.println("Order Limit Reached");
     }
        System.out.println("Thank YOU!!");

    }
}
