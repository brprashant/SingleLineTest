import com.google.common.base.Preconditions;

/**
 * Created by brprashant on 10/19/15.
 */
public class ReverseString {

    public static String reverse(String something){
        if (something==null) return null;
        int len = something.length();
        if (len <=1) return something;
        char[] characters = something.toCharArray();
        char[] reverse = new char[len];
//        for(int i=0;i<len;i++){
//            reverse[i]=characters[len-1-i];
//        }
        for(int i=0;i<len/2;i++){
            char t = characters[i];
            characters[i]= characters[len-1-i];
            characters[len-1-i]=t;
        }
        return String.valueOf(characters);
    }

    public static void main(String[] args){
        String text = null;
        String a = reverse(text);
        char[] b = null;
        char[] c = {};
        if (a!=null && c.equals(a))
            System.out.print(true);
        else
            System.out.print(false);

        System.out.println(noUniqueChar("1234"));
    }



    static boolean noUniqueChar(String something){
        Preconditions.checkNotNull(something,"something can not be null");

        char[] characters = something.toCharArray();
        if (characters.length > 256) return false;
        int charCheck[] = new int[256];
        for(int i = 0;i<characters.length;i++){
            if (charCheck[characters[i]] > 0){
                return false;
            }else {
                charCheck[characters[i]]++;
            }
        }
        return true;
    }
}
