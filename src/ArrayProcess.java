import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * Created by brprashant on 5/3/16.
 */
public class ArrayProcess<T> {

    public static void main(String[] args){
        stepsRemovingsmallesNumber(new int[]{1,2,3,4,3,3,2,1},false);
        Queue<String> queue;

    }

    private static String[] substrings(String expression){
        List<String> subStrings = new ArrayList<>();
        int len = expression.length();
        for(int i=0;i<len;i++){
            subStrings.add(expression.substring(i));
        }
        String[] subStringarray=new String[subStrings.size()];
        Arrays.sort(expression.toCharArray());
        return subStrings.toArray(subStringarray);

    }




    public static void stepsRemovingsmallesNumber(int[] array, boolean sorted) {
        if (null == array) return;
        int length = array.length;
        if (length<1) {
            return;
        }
        if (length==1) {
//            System.out.println(1);
            return;
        }
        int[] copy= Arrays.copyOf(array,length);
        if (!sorted){
            System.out.println(length);
            Arrays.sort(copy);
        }
        int min = copy[0];
        copy=cut(copy,min);

        int newlen=copy.length;
        if (newlen>=1){
            System.out.println(newlen);
            stepsRemovingsmallesNumber(copy,true);
        }

    }

    private static int[] cut(int[] array, int cut){
        int length = array.length;
        int[] retArray = new int[length];
        int j=0;
        for(int i=0;i<length;i++){
            int value = array[i]-cut;
            if (value!=0){
                retArray[j++]=value;
            }
        }
        return Arrays.copyOf(retArray,j);

    }

    private static int findMin(final int[] array){
        if (array==null) {
            throw new IllegalStateException("Array is empty");
        }
        int length = array.length;
        if  (array.length<1) {
            throw new IllegalStateException("Array is empty");
        }
        int min = array[0];
        for(int i=1;i<length;i++){
            if (array[i]<min)
                min = array[i];
        }
        return min;
    }
}
