package Input;

import java.util.Scanner;

public class mileToKilometer {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int mile = read.nextInt();
        double km = 1.60 * mile;
        System.out.println(km);
        System.out.println();
    }
}
