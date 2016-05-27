/**
 * Created by brprashant on 10/13/15.
 */
public class SomeClass {


    private static int ijk=10;
    private static int value = 20;
    private static byte someValue = 30;

    private Integer i = null;

    public SomeClass(int i){
    }


    public void setValue(int newValue){
        i = newValue;
    }

    public int getValue (){
//        throw new NullPointerException("");
        return value;
    }

    public byte getsomeValue(){
        return someValue;
    }
    public int getIntegerI(){
        return i;
    }
}
