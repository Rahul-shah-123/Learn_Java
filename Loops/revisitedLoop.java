package Loops;

import java.util.Scanner;

public class revisitedLoop {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        // This loop will run until i is less than or equal to 10, and j is less than 10.
        // It increments both i and j by 1 in each iteration.
        // The loop will print "value of i and j :" followed by the current values of i and j.
        System.out.print("Enter value of i :");
        int a = ss.nextInt();
        System.out.print("Enter value of j :");
        int b = ss.nextInt();
       /* for(int i=0,j=0; (i <=a) || (j < b); i++,j++) {
            j++;
            System.out.println("value of i and j :" + i + " >> " + j);
        }*/

        int i = 0;
        int j = 0;
         while((i <= a) && (j < b)) {
             System.out.println("value of i and j : " + i + " >> " + j);
             i++;
             j++;
         }
    }
}
