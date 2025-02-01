package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int num = ss.nextInt();
        int i = 2;
        boolean isPrime = true;
        while(i < num){
            if (num % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}
