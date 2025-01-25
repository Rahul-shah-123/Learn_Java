package SwitchCase;

public class sample {
    public static void main(String[] args){
        String x = "RAHUL";


        switch (x.toLowerCase()) {
            case "rahul":
                System.out.println("Value is small rahul");
                break;
            case "Shah":
                System.out.println("Value is b");
                break;
            default:
                System.out.println("Value is neither a nor b");
        }

    }
}
