package ConditionalStatements;

import java.util.Scanner;

public class checkAgeOfPerson {
    public static void main(String[] args){
        System.out.print("Please enter your age = ");//1 print statement
        Scanner ss = new Scanner(System.in);
        int age = ss.nextInt();                      //5 User Input
        int fixedAge = 18;                           //2 variable and dataType
        if (age >= fixedAge) {                       //3 operators
            System.out.println("You are read to vote!!");
        }else {
            System.out.println("You are not yet eligible to vote!!");
        }
       ss.close();
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);



    }

}
