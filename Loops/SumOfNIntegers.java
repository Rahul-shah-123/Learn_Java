package Loops;

import java.util.Scanner;

public class SumOfNIntegers {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int sum = 0,i = 1;
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
