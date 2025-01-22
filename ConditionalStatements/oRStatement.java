package ConditionalStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class oRStatement {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int z,x,c ;
        z = ss.nextInt();
        x = ss.nextInt();
        c = ss.nextInt();
        if(c > x || c > z){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        z = ss.nextInt();
        x = ss.nextInt();
        c = ss.nextInt();
        if(c > x || c > z){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
