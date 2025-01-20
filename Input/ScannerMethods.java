package Input;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        int sq = value.nextInt();
        System.out.println(sq*sq);
    }
}
