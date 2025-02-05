package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class numberPattern {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        for(int i =1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
