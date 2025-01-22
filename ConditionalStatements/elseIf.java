package ConditionalStatements;

import java.util.Scanner;

public class elseIf {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.print("Please enter the value1 = ");
        int b = ss.nextInt();
        System.out.print("Please enter the value2 = ");
        int a = ss.nextInt();
        if(a > b){
            System.out.println("a is greater than b");
        }else if(a == b){
            System.out.println("a is equal to b");
        }
        System.out.print("Please enter the value3 = ");
        b = ss.nextInt();
        System.out.print("Please enter the value4 = ");
        a = ss.nextInt();
        if (a > b){
            System.out.println("a is greater than b");
        }else if(a == b){
            System.out.println("a is equal to b");
        }

    }
}
