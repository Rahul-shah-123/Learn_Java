package Loops;

import java.util.Scanner;

public class replacementOfFor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i ;
        for (i =0; ; ){
            i++;
            if (i > n){
                break;
            }

            System.out.println(i);
        }
        System.out.println(i);
    }
}
