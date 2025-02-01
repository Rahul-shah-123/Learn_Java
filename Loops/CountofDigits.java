package Loops;

import java.util.Scanner;

public class CountofDigits {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int num, count = 0;
        num = ss.nextInt();
        while (num != 0){
          count = count +   1;
          num = num / 10;
        }
        System.out.println("Number of digits found" + count);
    }
}
