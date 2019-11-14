import java.util.ArrayList;
import java.util.List;

/**
 * Created by brprashant on 4/9/19.
 */
public class walmart {

    // abc = abc acb bac bca cab cba

    // abcsa = abcsa, abcas, abacs,

    public static void main (String[] args){

        printAllPermutations("abc");


    }

    static void printAllPermutations(String input){
        if (input == null || input.length()<1) {
            return;
        }
        System.out.print(permutations(input));
    }

    static List<String> permutations(String input){
        int len = input.length();
        List<String> allString= new ArrayList<>();
        if (len == 1){
            allString.add(input);
            return allString;
        }
        if (len > 1) {
            for(int i=0;i<input.length();i++){
                List<String> subList = permutations(input.substring( i+1));
                for(String subListOption : subList) {
                    allString.add(input.charAt(0)+ subListOption);
                    allString.add(subListOption + input.charAt(0));
                }
                List<String> subList2 = permutations(input.substring( 0,i-1));
                for(String subListOption : subList2) {
                    allString.add(input.charAt(0)+ subListOption);
                    allString.add(subListOption + input.charAt(0));
                }
                return allString;
            }
        }
        return allString;
    }

}
