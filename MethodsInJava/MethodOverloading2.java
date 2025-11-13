package MethodsInJava;

public class MethodOverloading2 {
    public static void main(String[] args) {
// This is the example of method overloading. (same method name same return type but different signature)
        sum(1,2);
        sum(1.2f,2.2f);
        sum(1,2.2);
        sum(1.2,2);

        int n = 2;
        switch (n){
            case 1 :
                System.out.println(n);
                break;
        }
    }

    public static void sum(int x, int y){
        System.out.println("Addition of 2 int's ");
    }
    public static void sum(float x, float y){
        System.out.println("Addition of 2 floats ");
    }
    public static void sum(int x, double y){
        System.out.println("Addition of 1 int and 1 double ");
    }
    public static void sum(double x, int y){
        System.out.println("Addition of 1 double and 1 int ");
    }
}
