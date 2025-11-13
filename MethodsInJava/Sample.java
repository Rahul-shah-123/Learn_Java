package MethodsInJava;

import org.w3c.dom.ls.LSOutput;

public class Sample {
    public static void main(String[] args) {

      loop(1,10);
        System.out.println("***********" );
        loop(20,40);
        System.out.println("***********" );
        loop(-10,0);
        System.out.println("***********") ;
    }
    public static void loop(int start, int stop){
        for (; start < stop; start++) {
            System.out.println(start);
        }
    }

}
