package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int fact = 1;
        int i = 1;
        while(i <= num){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
