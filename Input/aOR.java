package Input;

import java.util.Scanner;

public class aOR {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int width = scan.nextInt();
        int area = length * width;
        System.out.println("Area of Rectangle is = " + area);
    }
}
