package Input;

import java.util.Scanner;

public class cubesAndSquares {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println("Square is = " + n * n);
        System.out.println("Cube is = " + n * n * n);
    }
}
