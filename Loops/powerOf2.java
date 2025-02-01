package Loops;

import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number: ");  // Prompt the user to enter a number.
        int num = ss.nextInt();
        int i = 2;
        while(i <= num){
            System.out.println(i);
            i = i * 2;  // equivalent to i = i * 2;
        }
    }
}
