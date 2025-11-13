package MethodsInJava;

public class ReturnInMethod {
    public static void main(String[] args) {
        int area = areaOfRect(10,20);
        System.out.println("Area of Rectangle is : " + area);
    }

    public static int areaOfRect(int x, int y){
        return x * y ;
    }
}
