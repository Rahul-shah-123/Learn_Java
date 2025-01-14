package strings;

public class toCharArray {
    public static void main(String[] args){
        String word = "Rrhul Shah";
        char[] wordArray = word.toCharArray();
        wordArray[1] = 'a';
        System.out.println("Modified String: " + String.valueOf(wordArray));  // Output: Rahul Shah
    }
}
