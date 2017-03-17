package EightSamples;

import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by brprashant on 6/1/16.
 */
public class StringStream {

    public static void main (String[] args){
        System.out.println(solution("Forget  CVs..Save time . x x"));
//        System.out.println(solution("We test coders. Give us a try"));
        Scanner sc = new Scanner("");
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        if (S==null) return 0;
        int maxCount = 0;
        String[] sentences = S.split("[.?!]");
        for (String sentence : sentences) {
            System.out.println(" Sentence : " + sentence);
            String[] words = sentence.split("[\\W]+");
            int count = 0;
            for (String word : words ) {
                System.out.println("word : " + word);
                int wordVal = "".equals(word.replaceAll(" ", "")) ?  0 : 1;
                count = count + wordVal;
            }
            maxCount = count > maxCount ? count : maxCount;
        }
        return maxCount;
    }
}
