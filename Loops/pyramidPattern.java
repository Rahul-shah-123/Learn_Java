package Loops;

import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
//        outer loop for rows
        // Outer loop for the number of rows
        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = 1; j <= N - i; j++)
                System.out.print(" ");

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = N -1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= N - i; j++)
                System.out.print(" ");

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
