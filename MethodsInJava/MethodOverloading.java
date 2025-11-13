package MethodsInJava;

public class MethodOverloading {
    public static void main(String[] args) {
        
        loop1(); // this is my method
        System.out.println("***********");
        loop2(); // method calling here.
    }
    
    public static void loop1(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void loop2(){
        for(int i = 10 ; i <= 20 ; i++) {
            System.out.println(i);
        }
    }
}
