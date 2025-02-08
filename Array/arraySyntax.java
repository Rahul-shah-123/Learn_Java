package Array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class arraySyntax {
    public static void main(String[] args) {
        int[] arraySyntax = new int[5];
        int[] arr = {1,2,3,4,5,6,7,8,9};
        arr[1] = 23;
//        System.out.println(Arrays.stream(arr).limit(1).collect(Collectors.counting(2)));
        System.out.println(arr.length);
        
    }
}
