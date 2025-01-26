package Loops;

import java.util.Scanner;

public class sample {
    public static void main(String[] args){
      Scanner ss = new Scanner(System.in);
      System.out.print("Enter the number of times you want to print Rahul = ");  // number of times to print Rahul = 5
      int n = ss.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Rahul");
        }
    }
}
