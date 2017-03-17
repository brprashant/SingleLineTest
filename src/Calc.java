import java.util.ArrayList;

/**
 * Created by brprashant on 3/14/16.
 */
public class Calc {

    public static void main(String[] args){
        System.out.println("the result of 7 / 2 is " + 7/2);

        testPassingNull(1,2);
        System.out.println(testNullForString(null) ? "true" : " false" );


        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(2);
        array.add(2);

        System.out.println(array);
        alterArray(array);
        System.out.println("After processing : " + array);

        String something = "this is the original text";
        System.out.println(something);
        alterString(something);
        System.out.println("After altering "  + something);

    }


    public static void alterString(final String str){
        str.concat("I am intending to replace the string.");
    }

    public static void alterArray(final ArrayList<Integer> array){
        ArrayList<Integer> newArray = new ArrayList<>();
        ArrayList<Integer> removeItems = new ArrayList<>();
        for(Integer value : array){
            removeItems.add(value);
            newArray.add(++value);
        }
        array.addAll(newArray);

        for(Integer value : removeItems){
            array.remove(value);
        }
//        array.rem
    }

    static boolean testPassingNull(int a, int b) {
        return false;
    }


    static boolean testNullForString(String something){
        if (null==something) return true;
        try{
            return something.length() > 0;
        }catch (NullPointerException npe){
            npe.printStackTrace();
            return false;
        }
    }
}
