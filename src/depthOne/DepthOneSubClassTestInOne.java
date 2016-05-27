package depthOne;

/**
 * Created by brprashant on 4/3/16.
 */
public class DepthOneSubClassTestInOne {

    public static void main(String[] args){
        TestInOne obj = new TestInOne();
        System.out.println(TestInOne.staticNovalue);
        System.out.println(TestInOne.protectedStaticValue);

        System.out.println("" + obj.novalue);
        System.out.println("" + obj.protectedValue);
        System.out.println("" + obj.publicvalue);
    }
}
