package WhileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class syntaxOfWhile {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.print("Please enter the number = ");
        int num = ss.nextInt();
        int i = 1;
        while (i <= num){
            System.out.println("itrations no " + i);
            i++;
        }

    }
}
