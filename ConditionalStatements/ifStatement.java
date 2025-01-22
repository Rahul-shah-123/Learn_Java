package ConditionalStatements;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args){

        Scanner ss = new Scanner(System.in);
        System.out.print("Please enter a value 1 = ");
        int a = ss.nextInt();
        System.out.print("Please enter a value 2 = ");
        int b = ss.nextInt();
        if(a > b){
            System.out.println("Coding is fun!!");
        }
    }
}
