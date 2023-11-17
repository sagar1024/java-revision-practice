import java.util.Arrays;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Betty bought some butter";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
    }
}