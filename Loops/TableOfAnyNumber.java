package Loops;

import java.util.Scanner;

public class TableOfAnyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");  // Prompt user to enter a number.
        int num = scan.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num + "X" + i + "=" + i*num);
        }
    }
}
