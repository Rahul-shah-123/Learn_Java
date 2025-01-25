package SwitchCase;

public class RuntimeError {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        if(b == 0){
            System.out.println("Infinity");
            return;
        }
        int result = a / b;


    }
}
