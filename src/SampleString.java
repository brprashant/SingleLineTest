import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by brprashant on 5/18/16.
 */
public class SampleString {

    public SampleString() {
    }

    public boolean compareString(String characters, String string) {

        Preconditions.checkNotNull(characters);
        Preconditions.checkNotNull(string);

        int len1 = characters.length();
        int len2 = string.length();

        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();

            for(int i=0;i<len1;i++){
                char c = characters.charAt(i);
                if (!set1.contains(c)) set1.add(c);
            }
            for(int i=0;i<len2;i++) {
                char c = characters.charAt(i);
                if (!set2.contains(c)) set2.add(c);
            }
        return set1.containsAll(set2);
    }


    public static void main(String[] args){
        count_palindromes("asdf");
    }



    static int count_palindromes(String S) {
        if (S==null) return 0;
        int length = S.length();
        if (length <1) return 0;
        List<String> setOfSubStrings = new ArrayList<>();
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
//                String str = S.substring(i,j+1);
                setOfSubStrings.add(S.substring(i,j+1));
//                System.out.println(str);
            }
        }
        int count = 0;
        for(String s: setOfSubStrings){
            if (checkPalingDrome(s)){
                count++;
            }
        }

        return count;
    }

    private static boolean checkPalingDrome(String s) {

        int len = s.length();
        if (len<2) return true;

        for(int i=0;i<=len/2;i++){
            if (s.charAt(i)!=s.charAt(len-1-i))
                return false;
        }
        return true;
    }

}
