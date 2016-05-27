/**
 * Created by brprashant on 10/13/15.
 */
public class UserOfSomeClass {

    public static void main(String[] args){
        //SomeClass sc = new SomeClass();
        SomeClass sc = new SomeClass(2);

        System.out.println(sc.getIntegerI());

        sc.setValue(10);

        System.out.println(sc.getIntegerI());

        System.out.println(sc.getsomeValue());

    }
}